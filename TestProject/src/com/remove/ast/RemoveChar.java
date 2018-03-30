package com.remove.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.text.AbstractDocument.LeafElement;

public class RemoveChar {

	public static void main(String[] args) {
		// char[] ch1 = { 'a', 'b', 'c', 'a', 'a', 'b','n','n','n','n' };
		// char[] ch2 = { 'x', 'y', 'a', 'b', 'a', 'g','b' };

		char[] ch1 = new String("asasasagfdgdasasa").toCharArray();
		char[] ch2 = new String("dfsghasasasuityas").toCharArray();

		// Scanner sc = new Scanner(System.in);
		// int n;
		// System.out.println("enter the char array size");
		// StringBuffer sb = removeChar(ch1, ch2);
		Map<Character, Integer> m = removeCharList(ch1, ch2);
		System.out.println(m);
		Set<Map.Entry<Character, Integer>> s1 = m.entrySet();

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			char key = (char) entry.getKey();
			int val = (int) entry.getValue();
			if (val > 1) {
				m.remove(key);
			}
		}

		System.out.println(m);
		Set s=m.keySet();
		System.out.println(s);

	}

	/*
	 * static StringBuffer removeChar(char[] ch1, char[] ch2) { StringBuffer sb
	 * = new StringBuffer(); for (int i = 0; i < ch1.length; i++) { for (int j =
	 * 0; j < ch2.length; j++) { if (ch1[i] == ch2[j]) { ch2[j] = ' '; } } } for
	 * (int i = 0; i < ch1.length; i++) { for (int j = i + 1; j < ch1.length;
	 * j++) { if (ch1[i] == ch1[j]) { ch1[j] = ' '; if (j == ch1.length - 1) {
	 * ch1[i] = ' '; } } } } for (int i = 0; i < ch1.length; i++) { if (ch1[i]
	 * != ' ') { sb.append(ch1[i]); } } for (int j = 0; j < ch2.length; j++) {
	 * if (ch2[j] != ' ') { sb.append(ch2[j]); } } return sb; }
	 */ static Map<Character, Integer> removeCharList(char[] ch1, char[] ch2) {
		Map<Character, Integer> m = new ConcurrentHashMap<Character, Integer>();
		for (char c : ch1) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		for (char c : ch2) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		return m;

	}
}
