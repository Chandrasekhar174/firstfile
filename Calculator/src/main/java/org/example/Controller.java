package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Addition a;

    @Autowired
    Substraction s;
    @GetMapping("Check/add/{id1}/{id2}")
    public int Solution(@PathVariable int id1,@PathVariable int id2)
    {
        a.setA(id1);
        a.setB(id2);
        return a.print();
    }
    @GetMapping("Check/sub")
    public  int sub()
    {
        int ans=s.Print();
        return ans;
    }




}
