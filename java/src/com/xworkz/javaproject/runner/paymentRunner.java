package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.things.payment;

import java.time.LocalDateTime;

public class paymentRunner {


    public class PaymentRunner {
        public static void main(String[] args){
            System.out.println("payment details are.....");
            payment.displaypaymentInformation();
            payment.displayPaymentAmount(2000);
            payment.displayTransactionDetails(3000, LocalDateTime.now());

        }

    }

}
