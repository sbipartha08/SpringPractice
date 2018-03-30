package org.str.combination;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Combination {

	public static void main(String[] args) {
		String str = "1233bbhj";
		char[] ch = str.toCharArray();
		int length = ch.length;
		int size = 0;
		int repeat = 0;
		Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i]) + 1);
			} else {
				m.put(ch[i], 1);
			}
		}
		Set<Character> s = new HashSet<>();
		// System.out.println(m);
		s = m.keySet();
		// System.out.println(s);
		size = s.size();
		// System.out.println(size);
		for (int i = 1; i <= size; i++) {
			if (size == 1) {
				repeat = 1;
			} else if (size == length) {
				repeat += i;
			} else {
				if (length != size) {
					repeat =length*(length-(size-1));
				} else {
					repeat = 2;
				}			}
		}
		System.out.println("its possible "+repeat+"  no of combination");
	}

}
