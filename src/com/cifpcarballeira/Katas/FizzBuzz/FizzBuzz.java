package com.cifpcarballeira.Katas.FizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "Fizz Buzz";
        } else {
            if (num % 5 == 0) {
                return "Buzz";
            } else {
                if (num % 3 == 0) {
                    return "Fizz";
                } else {
                    return Integer.toString(num);
                }
            }
        }
    }
}
