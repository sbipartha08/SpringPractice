package com.equql.check;

public class CheckEquality {

	public static void main(String[] args) {
Person p=new Person(2,"partha");
Person p1=new Person(3,"ramu");
Person p2=new Person(2,"partha");
Person p3=p;
System.out.println(p.equals(p1));
System.out.println(p.equals(p2));
System.out.println(p.equals(p3));
	}

}
