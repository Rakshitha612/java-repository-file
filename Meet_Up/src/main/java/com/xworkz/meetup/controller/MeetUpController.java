package com.xworkz.meetup.controller;

import dto.MeetUpDetailsDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@RequestMapping("/")
@Controller
public class MeetUpController {
    public MeetUpController(){
        System.out.println("MeetUpController created");
    }
   @PostMapping("/submit")
    public String acceptMethod(@ModelAttribute MeetUpDetailsDto dto){
        System.out.println("acceptPostMethod() invoked");
        return "success.jsp";
    }

   @GetMapping
    public String acceptGetMethod(@ModelAttribute MeetUpDetailsDto dto){
        System.out.println("acceptGetMethod() invoked");
        dto.setCreatedBy("your name");
        dto.setCreatedOn(LocalDateTime.now());
        System.out.println("dto is:"+dto);

        //save data into the database

        return "success.jsp";
}
}
