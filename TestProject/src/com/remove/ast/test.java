package com.remove.ast;

import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		String s1 = "(a+81)+(b-7)*(d/7)+(f+9)+(h-5)";
		String replaceStr = s1.replaceAll("[^a-zA-Z 0-9]+", " ");
		/*String replace = replaceStr.trim();
		String[] str = replace.split("");
		System.out.println(replace);
		int len = str.length;
		System.out.println(len);

		for (int i = 0; i < len; i = i + 2) {
			System.out.println(str[i] + " value is=" + str[i + 1]);
		}*/

		StringTokenizer st = new StringTokenizer(replaceStr, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + " value= " + st.nextToken());
		}

	}

}
