package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMemberShipService {
    //abstract method
    boolean validateDto(GymMembershipDetailsDto dto);
    void readDto();



}


