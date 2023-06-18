package org.example;

import org.example.MyObject.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Mail m;

    @GetMapping("object")
    public String getObject()
    {
        String myobj=m.toString();
        MailHandler mailHandler=new MailHandler();
        mailHandler.sendMail();
        return  myobj;

    }


}
