package com.loops;

public class LoopingStatements {
	public static void main(String[] args) {
		// for every looping statements these 3 are must required:
		// initialization; condition; increment/decrement
		forLoop();
		whileLoop();
		doWhileLoop();
		enhancedForLoop(new int[] {1,2,3,4,5});
	}

	public static void forLoop() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void whileLoop() { // entry controlled loop
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void doWhileLoop() { // exit controlled loop
		int i = 0;
		do {
			System.out.println(i);
		} while (i < 10);
	}
	public static void enhancedForLoop(int[] arr) {
		for(int nums:arr) {
			System.out.println(nums);
		}
	}
}
