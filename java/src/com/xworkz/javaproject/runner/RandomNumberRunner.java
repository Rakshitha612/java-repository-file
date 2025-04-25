package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.things.RandomNumber;

public class RandomNumberRunner {
    public static void main(String[] args) {
        System.out.println("string number!!!");
        int number= RandomNumber.getRandomNumber();
        System.out.println("number is :"+number);
    }
}
