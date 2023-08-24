package test.com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.com.junit.Calc;

public class CalcTest {
    Calc calc = new Calc();

    @Test
    public void somaTest(){
        assertEquals(2, calc.soma(1, 1));
    }
}
