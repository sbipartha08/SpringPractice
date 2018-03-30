package com.raj.test;

class A {
	public void m1() {
		try {
			m2();
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(6);
		} finally {
			try {
				m2();
			} catch (Exception e) {
				System.out.println(7);
			}
			System.out.println(8);
		}
	}

	public void m2() throws Exception {
		throw new Exception();
	}
}

public class Test {

	public static void main(String[] args) throws Exception {
		/*int i1 = 10;
		int i2 = 10;
		System.out.println(i1 == i2);*/
		String s = "java";
		String s1 = "java";
		String s2=new String("java");
		/*System.out.println(s == s1);
		System.out.println(s.equals(s1));
		System.out.println(s1 = s);
		System.out.println(s = s1);*/
		System.out.println(s1.equals(s2));
		System.out.println(s1== s2);
		System.out.println(s1 = s2);
		System.out.println(s2 = s1);
		}

}
