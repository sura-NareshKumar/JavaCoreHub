package com.operators;

public class AllOperatorsExample {

	public static void main(String[] args) {
		// Arithmetic Operators in java
		int a = 10;
		int b = 5;
		System.out.println("Arithmetic Operators:");
		System.out.println("a + b = " + (a + b)); // Addition
		System.out.println("a - b = " + (a - b)); // Subtraction
		System.out.println("a * b = " + (a * b)); // Multiplication
		System.out.println("a / b = " + (a / b)); // Division
		System.out.println("a % b = " + (a % b)); // Modulus

		// Relational Operators
		System.out.println("\nRelational Operators:");
		System.out.println("a == b: " + (a == b)); // Equal to
		System.out.println("a != b: " + (a != b)); // Not equal to
		System.out.println("a > b: " + (a > b)); // Greater than
		System.out.println("a < b: " + (a < b)); // Less than
		System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
		System.out.println("a <= b: " + (a <= b)); // Less than or equal to

		// Logical Operators
		boolean x = true;
		boolean y = false;
		System.out.println("\nLogical Operators:");
		System.out.println("x && y: " + (x && y)); // Logical AND
		System.out.println("x || y: " + (x || y)); // Logical OR
		System.out.println("!x: " + (!x)); // Logical NOT

		// Bitwise Operators
		int c = 6; // 110 in binary
		int d = 4; // 100 in binary
		System.out.println("\nBitwise Operators:");
		System.out.println("c & d: " + (c & d)); // Bitwise AND
		System.out.println("c | d: " + (c | d)); // Bitwise OR
		System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
		System.out.println("~c: " + (~c)); // Bitwise NOT
		System.out.println("c << 1: " + (c << 1)); // Left shift
		System.out.println("c >> 1: " + (c >> 1)); // Right shift
		System.out.println("c >>> 1: " + (c >>> 1)); // Unsigned right shift

		// Assignment Operators
		System.out.println("\nAssignment Operators:");
		int e = 10;
		e += 5; // e = e + 5
		System.out.println("e += 5: " + e);
		e -= 3; // e = e - 3
		System.out.println("e -= 3: " + e);
		e *= 2; // e = e * 2
		System.out.println("e *= 2: " + e);
		e /= 4; // e = e / 4
		System.out.println("e /= 4: " + e);
		e %= 3; // e = e % 3
		System.out.println("e %= 3: " + e);

		// Unary Operators
		System.out.println("\nUnary Operators:");
		int f = +a; // Unary plus
		int g = -b; // Unary minus
		System.out.println("f (unary plus of a): " + f);
		System.out.println("g (unary minus of b): " + g);
		System.out.println("++a: " + (++a)); // Pre-increment
		System.out.println("b++: " + (b++)); // Post-increment
		System.out.println("b after b++: " + b); // Value of b after post-increment
		System.out.println("--a: " + (--a)); // Pre-decrement
		System.out.println("b--: " + (b--)); // Post-decrement
		System.out.println("b after b--: " + b); // Value of b after post-decrement

		// Ternary Operator
		System.out.println("\nTernary Operator:");
		int min = (a < b) ? a : b;
		System.out.println("min of a and b: " + min);
	}
}
