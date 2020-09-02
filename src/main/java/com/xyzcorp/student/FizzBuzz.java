package com.xyzcorp.student;

public class FizzBuzz {


    public static String convert(int i) {

        if (i % 5 == 0 && i % 3 == 0){
            return "Fizz Buzz";
        }else if(i % 3 == 0){
            return "Fizz";
        }else if(i % 5 == 0){
            return "Buzz";
        }else{
            return Integer.toString(i);
        }
    }
}
