package com.ivy.example;

import org.apache.log4j.Logger;

public class MyExampleClass {

	static Logger log = Logger.getLogger(MyExampleClass.class.getName());
	
	public static void main(String[] args) {
		if (args.length == 2) {
			try {
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				System.out.println("a + b = " + a + " + " + b + " = " + (a + b));
			} catch (NumberFormatException e) {
				System.err.println("Invalid Input: Please enter numbers.");
			}
		} else {
			System.err.println("Missing Input: Please enter TWO numbers.");
			log.info("This is an exception message");
		}
	}
}