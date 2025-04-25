package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

import java.util.Arrays;

public class GymMembershipRepositoryImpl implements GymMembershipRepository {
    private GymMembershipDetailsDto[] listOfDtos=new GymMembershipDetailsDto[2];
    private int index = 0;
    @Override

    public boolean saveDto(GymMembershipDetailsDto dto){
        System.out.println("invoking the GymMembershipRepositoryImpl()");
        System.out.println("dto is:"+dto);
        if(this.index< listOfDtos.length){
            listOfDtos[this.index]=dto;
            System.out.println("saved successfully");
            return true;
        }else{
            System.out.println("check array length or array is full");
        }
        return false;
    }
    @Override
    public void readDto(){
        System.out.println(Arrays.toString(listOfDtos));

    }
}
