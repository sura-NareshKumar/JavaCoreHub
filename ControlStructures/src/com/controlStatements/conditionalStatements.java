package com.controlStatements;

public class conditionalStatements {
	public static void main(String[] args) {
		ifStatement(true);
		ifElseStatement(false);
		ElseIfLadderStatement(false, true);
		switchDemo(2);
	}

	public static void ifStatement(boolean condition) {
		if (condition) {
			// this block will execute when condition is true
			System.out.println("i am in if block");
		}

	}

	public static void ifElseStatement(boolean condition) {
		if (condition) {
			// this block will execute when condition is true
			System.out.println("i am in if block");
		} else {
			// this block will execute when condition is false
			System.out.println("i am in else block");
		}

	}

	public static void ElseIfLadderStatement(boolean condition1, boolean condition2) {
		if (condition1) {
			// this block will execute if condition1 is true
			System.out.println("i am in if block");
		} else if (condition2) {
			// this block will execute if condition2 is true
			System.out.println("i am in else-if block");
		} else {
			// this block will execute if both conditions are false
			System.out.println("i am in else block");
		}
	}

	public static void switchDemo(int value) {
		switch (value) {
		case 1:
			// code to be executed if expression equals value=1
			break;
		case 2:
			// code to be executed if expression equals value=2
			break;
		// you can have any number of case statements
		default:
			// code to be executed if expression doesn't match any case
		}
	}

}
