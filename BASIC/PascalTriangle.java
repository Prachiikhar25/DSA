package BASIC;

import java.util.*;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		// 2D list to store triangle
		List<List<Integer>> triangle = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				// First and last element of every row is 1
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					// Sum of two elements above
					int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
					row.add(val);
				}
			}
			triangle.add(row);
		}

		// Printing the triangle
		for (List<Integer> row : triangle) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
