package com.xworkz.meetup.configuration;

@Configuration
@ComponentScan("com.xworkz")

public class MeetUpConfiguration implements webMvcConfigure{
    public MeetUpConfiguration(){
        System.out.println("MeetUpConfiguration created");
    }
}
