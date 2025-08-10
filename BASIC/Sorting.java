package BASIC;

import java.util.Arrays;

public class Sorting {
	static void BubbleSort() {
		int arr[] = { 7, 8, 3, 1, 2 };
		int n = arr.length;
		int c = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				c = c + 1;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Count is : " + c);
	}

	static void BitWiseSwap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a = " + a + " b = " + b);
	}

	static void SwapNoThirdVar(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + " b = " + b);

	}

	public static void main(String[] args) {
		BubbleSort();
		BitWiseSwap(5, 8);
		SwapNoThirdVar(5, 8);
	}
}
