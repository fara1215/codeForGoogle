package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import google2.Math;

public class MathTest {

	@Test
	public void test() {
		System.out.println("My JUnit testing");
		Math m =new Math();
		int output= m.add(5, 4);
		assertEquals(9, output);
	}

}
