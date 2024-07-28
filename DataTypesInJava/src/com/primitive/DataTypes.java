package com.primitive;

public class DataTypes {
	//total 8 primitive data types are available in java
	byte age; //range -128 to 127
	short dno; //range -32,768 to 32,767
	int id; //range -2^31 to 2^31-1
	long phoneNumber; //range -2^63 to 2^63-1
	float marks; //range Approximately ±3.40282347E+38F
	double salary; //range Approximately ±1.79769313486231570E+308
	char alpha; //range 0 to 65,535 (unicode characters)
	boolean isValid; //range true or false

	public static void main(String[] args) {
		System.out.println("Default values are:");
		DataTypes obj= new DataTypes();
		System.out.println(obj.age);
		System.out.println(obj.dno);
		System.out.println(obj.id);
		System.out.println(obj.phoneNumber);
		System.out.println(obj.marks);
		System.out.println(obj.salary);
		System.out.println(obj.alpha);
		System.out.println(obj.isValid);
		

	}

}
