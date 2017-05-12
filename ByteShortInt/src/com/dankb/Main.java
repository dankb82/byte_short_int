package com.dankb;

public class Main {

    public static void main(String[] args) {

        byte byteChallengeValue = 120;
        short shortChallengeValue = 12000;
        int intChallengeValue = 1_200_450;

        //not necessary to cast because long will accept an integer
        long longChallengeValue =  50000 + (10* (byteChallengeValue + shortChallengeValue + intChallengeValue));
        System.out.println("The total is: " + longChallengeValue);

    }
}
