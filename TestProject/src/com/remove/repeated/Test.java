package com.remove.repeated;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String args[]) {
		String s = "acbbcddax";
		char[] ch = s.toCharArray();
		Set se = new HashSet();
		for (int i = 0; i < ch.length; i++) {
			if (se.contains(ch[i])) {
				se.remove(ch[i]);
			} else {
				se.add(ch[i]);
			}
		}
		System.out.println(se);
	}
}
