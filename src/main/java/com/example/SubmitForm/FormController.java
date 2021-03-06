package com.example.SubmitForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    CustomersRepo repo;

    @RequestMapping("/")
    public String details(){
        return "Reg";
    }
    @RequestMapping("/details")
    public String details(Customers customers){
        repo.save(customers);
        return "Reg";
    }
    @RequestMapping("/getdetails")
    public String getdetails(){

        return "ViewDetails";
    }

    @PostMapping("/getdetails")
    public  ModelAndView getdetails(@RequestParam int cid)
    {
        ModelAndView mv = new ModelAndView("Retrieve");
        Customers customers = repo.findById(cid).orElse(null);
        mv.addObject(customers);
        return mv;

    }

}
