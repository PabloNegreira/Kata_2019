package com.cifpcarballeira.Katas.FizzBuzz.Test;

import com.cifpcarballeira.Katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_FizzBuzz {

    public Test_FizzBuzz() {
    }

    @Test
    public void test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(1);
        assertEquals("1", resultado);
    }

    @Test
    public void test2devuelve2() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(2);
        assertEquals("2", resultado);
    }

    @Test
    public void test3devuelveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(3);
        assertEquals("Fizz", resultado);
    }

    @Test
    public void test4devuelveBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(5);
        assertEquals("Buzz", resultado);
    }
}
