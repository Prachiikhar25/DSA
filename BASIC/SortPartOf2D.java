package BASIC;

import java.util.Arrays;

public class SortPartOf2D {
	public static void main(String args[]) {
		// Example 2D array
		int nums[][] = {
				{ 3, 4 },
				{ 1, 2 },
				{ 5, 1 },
				{ 2, 3 }
		};

		System.out.println("Original array:");
		printArray(nums);

		// Sort by first element of each sub-array (CORRECT)
		Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
		System.out.println("\nSorted by first element:");
		printArray(nums);

		// Reset array for next example
		int nums2[][] = {
				{ 1, 4 },
				{ 1, 2 },
				{ 1, 3 },
				{ 2, 1 }
		};

		// Sort by second element of each sub-array
		Arrays.sort(nums2, (a, b) -> Integer.compare(a[1], b[1]));
		System.out.println("\nSorted by second element:");
		printArray(nums2);

		// Sort by first element, then by second element if first elements are equal
		int nums3[][] = {
				{ 1, 4 },
				{ 2, 1 },
				{ 1, 2 },
				{ 1, 3 }
		};

		Arrays.sort(nums3, (a, b) -> {
			if (a[0] != b[0]) {
				return Integer.compare(a[0], b[0]); // Sort by first element
			} else {
				return Integer.compare(a[1], b[1]); // If first elements equal, sort by second
			}
		});
		System.out.println("\nSorted by first element, then second:");
		printArray(nums3);
	}

	// Helper method to print 2D array
	static void printArray(int[][] arr) {
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}
}
// Ascending sort->
// Arrays.sort(nums,(a,b)-> Integer.compare(a[0],b[0]));
// Descending sort->
// Arrays.sort(nums, (a, b) -> Integer.compare(b[0], a[0]));
