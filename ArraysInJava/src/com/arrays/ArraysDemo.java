package com.arrays;
//arrays used to store multiple values of the same type in a single variable
public class ArraysDemo {
	public static void main(String[] args) {
	//array can be write & declared in 3 ways
	int[] a=new int[10];
	int b[]=new int[10];
	int []c=new int[10];
	iterationOfArray(a);
	moreInfoOnArrays();
	
	}
	public static void iterationOfArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i);
		}
	}
	public static void moreInfoOnArrays() {
		int[] a= {1,2,3,4,5,6}; //static initialization
		System.out.println(a[0]); //accessing elements in an array by using index
		a[0]=10;//changing elements in an array
	}

}
