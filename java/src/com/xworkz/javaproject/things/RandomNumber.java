package com.xworkz.javaproject.things;
import java.util.Random;
public class RandomNumber {
    public static int getRandomNumber(){
        Random random=new Random();
        int number=random.nextInt(1,100);
        return number;
    }
}
