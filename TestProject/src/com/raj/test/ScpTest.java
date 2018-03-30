package com.raj.test;

public class ScpTest {

	public static void main(String[] args) {
		String s = new String("durga");
		String s2 = s.intern();
		String s3 = "durga";
		//System.out.println("s==s2 " + (s == s2));
		//System.out.println("s2==s3 " + (s2 == s3));
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}
