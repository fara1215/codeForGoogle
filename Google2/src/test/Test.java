package test;

import google2.Math;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        System.out.println("My JUnit testing");
        Math m =new Math();
        int output= m.add(5, 4);
        assertEquals(9, output);
    }
}
