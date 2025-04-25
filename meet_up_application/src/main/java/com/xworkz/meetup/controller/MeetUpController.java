package com.xworkz.meetup.controller;

@RequestMapping("/")

public class MeetUpController {
    public MeetUpController(){
        System.out.println("MeetUpController created");
    }
    @PostMapping("/submit")
    public String acceptMethod(){
        System.out.println("acceptPostMethod() invoked");
        return "success.jsp";
    }

    @GetMapping
    public String acceptGetmethod(){
        System.out.println("acceptGetMethod() invoked");
    }
}
