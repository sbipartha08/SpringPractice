package com.raj.test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

	public static void main(String[] args) {
		CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		Iterator itr = l.iterator();
		l.add("d");
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println(s1);
		}
		System.out.println(l);
	}

}
