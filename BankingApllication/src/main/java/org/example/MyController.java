package org.example;

import org.example.MyObject.Bank;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestController
public class MyController {

    private List<Bank> li;
    HashSet<Integer>hs;
    public MyController()
    {

        li=new ArrayList<>();
        hs=new HashSet<>();
    }
    @GetMapping("AllCustomer")
    public List<Bank> getAll()
    {
        return li;
    }
    @PostMapping("OpenAccount")
    public String openAcc(@RequestBody Bank bank)
    {
        if(!hs.contains(bank.getId()))
        {
            hs.add(bank.getId());
            li.add(bank);
            return "Successfully Account Open";

        }
        return "this "+bank.getId()+" is already done";
    }
    @PutMapping("Deposit/{id}/{amount}")
    public String addAmount(@PathVariable Integer id,@PathVariable Integer amount)
    {
        if(hs.contains(id))
        {
            for(Bank bank:li)
            {
                if(bank.getId().equals(id))
                {
                    Integer a=bank.getAmount();
                    bank.setAmount(a+amount);
                    return "amount Update";
                }
            }
        }
        return "Id"+id+"not found";
    }
    @PutMapping("Withdrew/{id}/{amount}")
    public String Withdrew(@PathVariable Integer id,@PathVariable Integer amount)
    {
        if(hs.contains(id))
        {
            for(Bank bank:li)
            {
                if(bank.getId().equals(id))
                {
                    Integer a=bank.getAmount();
                    if(amount<=a)
                    {
                        bank.setAmount(a-amount);
                        return "Withdrew Successfully";
                    }
                    return "Entered amount too large";
                }
            }
        }
        return "Id"+id+"not found";
    }
    @GetMapping("Print/{id}")
    public String getPrint(@PathVariable Integer id)
    {
        for(Bank bank:li)
        {
            if(bank.getId().equals(id))
            {
                return "Your Id:"+id+"\nName:"+bank.getName()+"\nAmount:"+bank.getAmount();
            }
        }
        return "Invalid Id";
    }
}
