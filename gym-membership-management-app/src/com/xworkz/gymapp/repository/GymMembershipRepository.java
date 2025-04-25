package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMembershipRepository {
    boolean saveDto(GymMembershipDetailsDto dto);
    void readDto();
}

