package com.raj.test;

class Parent {
	public static void message(int a) {
		System.out.println("Good Morning :" + a);
	}

	public void message(int a, int b) {
		System.out.println("Good Morning :" + a + " &" + b);
	}
}

class Child extends Parent{
	public static void message(int a) {
		System.out.println("Good Afternoon :" + a);
	}
}

public class PCTest {

	public static void main(String[] args) {
		Parent c = new Child();
		//Child c=new Child();
		c.message(2);
	}

}
