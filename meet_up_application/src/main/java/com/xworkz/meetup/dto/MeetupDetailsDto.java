package com.xworkz.meetup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@ToString

public class MeetupDetailsDto {
    private LocalDate date;
    private LocalTime time;
    private String personname;
    private String place;
    private String gift;
}
