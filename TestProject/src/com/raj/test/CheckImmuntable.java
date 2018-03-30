package com.raj.test;

public class CheckImmuntable {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		System.out.println("s1==s2 " + (s1 == s2));
		s2 = "spring";
		String s3 = "java";
		s1.concat(" j2ee");
		System.out.println("s1==s3 " + (s1 == s3));
		System.out.println("s1 " + s1 + " s2 " + s2 + " s3" + s3);
	}

}
