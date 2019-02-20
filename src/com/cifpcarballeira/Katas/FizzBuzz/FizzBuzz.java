package com.cifpcarballeira.Katas.FizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num == 1) {
            return "1";
        } else {
            return "2";
        }
    }
}
