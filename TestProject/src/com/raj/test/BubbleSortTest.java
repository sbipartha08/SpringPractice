package com.raj.test;

import java.util.Scanner;

public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("enter " + n + " of array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		int t = 0;
		int y=0;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int swap = 0;
			for (int j = 0; j < length - 1 - i; j++) {
				System.out.println(t++);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap++;
					y++;
				}
			}
			if (swap == 0)
				break;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.println();
		System.out.println(y);
	}

}
