/*
 * Copyright (c) 1979-2023, Psyh2409 and/or its affiliates. All rights reserved.
 * PSYH2409 PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.gmail.psyh2409;
/**
 * This class was created to implement methods of arithmetic (plus, minus, 
 * multiply, divide) operations of task #9 of the Java_Core Logos_IT_Academy course. 
 * The main method for entering the program is also implemented in the class. 
 * The topic of the task is "Exceptions", so the variables are checked for various 
 * conditions in the checkVariables method, which throws and handles 
 * IllegalArgumentException, ArithmeticException, IllegalAccessException and 
 * the test exception MyException.
 * @see MyException
 * @author Psyh2409
 * @since 1.8
 */
public class Methods {

	public static void main(String[] args) {
		int a = 22;
		int b = 5;
		System.out.println((a*-1) + "+" + (b*-1) + "=" + plus(a*-1, b*-1));
		System.out.println((a*0) + "-" + b + "=" + minus(a*0, b));
		System.out.println(a + "-" + (b*0) + "=" + minus(a, b*0));
		System.out.println((a*0) + "*" + (b*0) + "=" + multiply(a*0, b*0));
		System.out.println(a + "/" + b + "=" + devision(a, b));
		System.out.println(a + "/" + (b*-1) + "=" + devision(a, b*-1));
	}

	public static double devision(int i, int j) {
		checkVariables(i, j);
		return (double) i/j;
	}

	public static int multiply(int i, int j) {
		checkVariables(i, j);
		return i*j;
	}

	public static int minus(int i, int j) {
		checkVariables(i, j);
		return i-j;
	}

	public static int plus(int i, int j) {
		checkVariables(i, j);
		return i+j;
	}

	private static void checkVariables(int i, int j) {
		try {
		if (i<0 & j<0) {
			throw new IllegalArgumentException("i<0 & j<0");
		}

		if ((i==0 & j!=0) | (i!=0 & j==0)) {
			throw new ArithmeticException("(i==0 & j!=0) | (i!=0 & j==0)");
		}

		if (i==0 & j==0) {
			throw new IllegalAccessException("i==0 & j==0");
		}

		if (i>0 & j>0) {
			throw new MyException("i>0 & j>0");
		}
		}catch (IllegalArgumentException iae) {
			iae.printStackTrace(); 
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
		}catch (IllegalAccessException iace) {
			iace.printStackTrace();
		}catch (MyException me) {
			me.printStackTrace();
		}
		
	}
}

/* Output:
java.lang.IllegalArgumentException: i<0 & j<0
	at com.gmail.psyh2409.Methods.changeVariables(Methods.java:39)
	at com.gmail.psyh2409.Methods.plus(Methods.java:32)
	at com.gmail.psyh2409.Methods.main(Methods.java:8)
-22+-5=-27
java.lang.ArithmeticException: (i==0 & j!=0) | (i!=0 & j==0)
	at com.gmail.psyh2409.Methods.changeVariables(Methods.java:43)
	at com.gmail.psyh2409.Methods.minus(Methods.java:27)
	at com.gmail.psyh2409.Methods.main(Methods.java:9)
0-5=-5
java.lang.ArithmeticException: (i==0 & j!=0) | (i!=0 & j==0)
	at com.gmail.psyh2409.Methods.changeVariables(Methods.java:43)
	at com.gmail.psyh2409.Methods.minus(Methods.java:27)
	at com.gmail.psyh2409.Methods.main(Methods.java:10)
22-0=22
java.lang.IllegalAccessException: i==0 & j==0
	at com.gmail.psyh2409.Methods.changeVariables(Methods.java:47)
	at com.gmail.psyh2409.Methods.multiply(Methods.java:22)
	at com.gmail.psyh2409.Methods.main(Methods.java:11)
0*0=0
com.gmail.psyh2409.MyException: i>0 & j>0
	at com.gmail.psyh2409.Methods.changeVariables(Methods.java:51)
	at com.gmail.psyh2409.Methods.devision(Methods.java:17)
	at com.gmail.psyh2409.Methods.main(Methods.java:12)
22/5=4.4
22/-5=-4.4
 * */
