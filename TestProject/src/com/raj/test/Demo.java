package com.raj.test;

class DemoPojo {
	private int id;
	private String name;
	private float percentage;

	public DemoPojo(int id, String name, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "DemoPojo [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

}

public class Demo {

	public static void main(String[] args) {
		DemoPojo dp=new DemoPojo(23,"partha",67.90f);
		DemoPojo dp1=new DemoPojo(23,"partha",67.90f);
		System.out.println(dp.toString());
		System.out.println(dp.hashCode());
		System.out.println(dp1.hashCode());


	}

}
