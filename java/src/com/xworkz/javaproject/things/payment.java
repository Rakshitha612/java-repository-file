package com.xworkz.javaproject.things;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class payment {
    public static String paymentFrom;
    public static String paymentTo;
    public static double amount;
    public static LocalDate transactionDate;
    public static LocalTime transactionTime;
    //4 way to declare the methods
    //1.method without returntype and without parameter
    public static void displaypaymentInformation(){
        paymentFrom="xyz";
        paymentTo="abc";
        amount = 1000;
        transactionDate=LocalDate.now();
        transactionTime=LocalTime.now();
        System.out.println("payment From:"+paymentFrom);
        System.out.println("payment to:"+paymentTo);
        System.out.println("amount:"+amount);
        System.out.println("transaction Date:"+transactionDate);
        System.out.println("transaction Time:"+transactionTime);
    }
    public static void displayPaymentAmount(double paidAmount){
        System.out.println("paid amount is:"+paidAmount);
    }
    public static void displayTransactionDetails(double paidAmount, LocalDateTime paymentDoneOn) {
        System.out.println("paid amount is:"+amount);
        System.out.println("payment Done On:"+paymentDoneOn);
    }
}


