package com.perfect.squre;

import java.util.Scanner;

public class PerfectSqure {

	public static void main(String[] args) {
		int num, sqr;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num = sc.nextInt();
		System.out.println("enter a squre number");
		sqr = sc.nextInt();
		perfectSqure(num, sqr);

	}

	static void perfectSqure(int num, int sqr) {
		int haif = (num + 1) / 2;
		boolean isSqure = false;
		int squre = sqr;
		for (int i = haif; i > 0; i--) {
			squre *=sqr;
			if (sqr > haif) {
				break;
			}
			if (squre > num) {
				continue;
			}
			if (squre == num) {
				System.out.println("this  number is perfect squre");
				isSqure = true;
				break;
			}
		}
		if(!isSqure){
			System.out.println("this is not perfect squre number");
		}
	}
}
