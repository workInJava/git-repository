package com.corejava.sample;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Ignore;
import org.junit.Test;

public class TestCalculate {

	@Test
	public void testAddLongLong() {
		long r = Calculate.add(5, 10);
		//╤оят
		assertEquals(r, 15);
	}

	@Test
	public void testAddDoubleDouble() {
		double r = Calculate.add(3.14, 5.67);
		//йДЁЖ
		System.out.println(r);
		//╤оят
		assertEquals(r, 8.81);
	}

	@Test
	public void testSubstractLongLong() {
		double r = Calculate.substract(120, 50);
		//╤оят
		assertEquals(r, 70);
	}

	@Test
	public void testSubstractDoubleDouble() {
		double r = Calculate.substract(6.5, 2.3);
		//╤оят
		assertEquals(r, 4.2);
	}

	@Test
	public void testMultiplyLongLong() {
		double r = Calculate.multiply(10, 10);
		//╤оят
		assertEquals(r, 100);
	}

	@Test
	public void testMultiplyDoubleDouble() {
		double r = Calculate.multiply(5.0, 1.2);
		//╤оят
		assertEquals(r, 6.0);
	}

	@Test
	public void testDivideLongLong() {
		double r = Calculate.divide(40, 5);
		//╤оят
		assertEquals(r, 8);
	}

	@Test
	public void testDivideDoubleDouble() {
		double r = Calculate.divide(6.6, 1.1);
		//╤оят
		assertEquals(r, 6.0, 0.00001);
	}

	@Test
	@Ignore
	public void testFactor() {
		BigInteger bi = Calculate.factor(5);
		//╤оят
		assertEquals(bi, 120);
	}
	

	@Test
	public void testToBinary() {
		String str = Calculate.toBinary(11);
		//╤оят
		assertEquals(str, String.valueOf(1011));
	}

}
