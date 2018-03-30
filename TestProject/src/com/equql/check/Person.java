package com.equql.check;

import javax.print.attribute.standard.RequestingUserName;

public class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		/*Person p = (Person) obj;
		try{
			int id1=this.id;
			String name1=this.name;
			int id2=p.id;
			String name2=this.name;
			if (id1 == id2 && name1.equals(name2)) {
				return true;
			} else {
				return false;
			}
		}
		catch(ClassCastException | NullPointerException e){
			return false;

		}*/
		if(obj instanceof Person){
			Person p = (Person) obj;
			if (id == p.id && name.equals(p.name)){
				return true;
			}else{
				return false;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Person p = new Person(2, "partha");
		Person p1 = new Person(3, "ramu");
		Person p2 = new Person(2, "partha");
		Person p3 = p;
		System.out.println(p.equals(p1));
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));

	}
}
