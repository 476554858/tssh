package com.controller;

import com.entity.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    public PersonService personService;

    @RequestMapping("/add")
    public void addPerson(){
        Person p = new Person();
        p.setIdCard("1");
        p.setAddress("henan");
        p.setName("zs");
        p.setPhone("151");
        personService.addPerson(p);
    }

    @RequestMapping("/del")
    public void del(@RequestParam("id")Integer id){
        personService.deleterPersonById(id);
    }

    @RequestMapping("/update")
    public void update(){
        Person p = new Person();
        p.setId(2);
        p.setIdCard("1");
        p.setAddress("xxx");
        p.setName("xxx");
        p.setPhone("xx");
        personService.updatePerson(p);
    }

    @RequestMapping("/getone")
    public void getone(@RequestParam("id")Integer id){
        Person p = personService.getPersonById(id);
        System.out.println(p.toString());
    }


    @RequestMapping("/getall")
    public void getall(){
        List<Person> persons = personService.getPersons();
        for(Person p:persons){
            System.out.println(p.toString());
        }
    }
}
