package BASIC;

import java.util.Arrays;
import java.util.Comparator;

public class SortPartOf2D {
	public static void main(String args[]) {
		System.out.println("=== 2D Array Sorting Examples ===\n");

		// Example 1: Sort by first element
		int nums1[][] = {
				{ 3, 4 },
				{ 1, 2 },
				{ 5, 1 },
				{ 2, 3 }
		};

		System.out.println("Example 1: Sort by first element");
		System.out.println("Original array:");
		printArray(nums1);

		// Ascending sort by first element
		Arrays.sort(nums1, (a, b) -> Integer.compare(a[0], b[0]));
		System.out.println("Sorted by first element (ascending):");
		printArray(nums1);

		// Descending sort by first element
		Arrays.sort(nums1, (a, b) -> Integer.compare(b[0], a[0]));
		System.out.println("Sorted by first element (descending):");
		printArray(nums1);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Example 2: Sort by second element
		int nums2[][] = {
				{ 1, 4 },
				{ 3, 2 },
				{ 2, 5 },
				{ 4, 1 }
		};

		System.out.println("Example 2: Sort by second element");
		System.out.println("Original array:");
		printArray(nums2);

		Arrays.sort(nums2, (a, b) -> Integer.compare(a[1], b[1]));
		System.out.println("Sorted by second element:");
		printArray(nums2);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Example 3: Sort by first element, then by second element
		int nums3[][] = {
				{ 1, 4 },
				{ 2, 1 },
				{ 1, 2 },
				{ 1, 3 },
				{ 2, 3 }
		};

		System.out.println("Example 3: Sort by first element, then second element");
		System.out.println("Original array:");
		printArray(nums3);

		Arrays.sort(nums3, (a, b) -> {
			if (a[0] != b[0]) {
				return Integer.compare(a[0], b[0]); // Sort by first element
			} else {
				return Integer.compare(a[1], b[1]); // If first elements equal, sort by second
			}
		});
		System.out.println("Sorted by first element, then second:");
		printArray(nums3);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Example 4: Sort by sum of elements
		int nums4[][] = {
				{ 3, 4 }, // sum = 7
				{ 1, 8 }, // sum = 9
				{ 5, 1 }, // sum = 6
				{ 2, 3 } // sum = 5
		};

		System.out.println("Example 4: Sort by sum of elements");
		System.out.println("Original array:");
		printArrayWithSum(nums4);

		Arrays.sort(nums4, (a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1]));
		System.out.println("Sorted by sum of elements:");
		printArrayWithSum(nums4);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Example 5: Sort by absolute difference
		int nums5[][] = {
				{ 3, 7 }, // diff = 4
				{ 1, 2 }, // diff = 1
				{ 8, 3 }, // diff = 5
				{ 5, 5 } // diff = 0
		};

		System.out.println("Example 5: Sort by absolute difference");
		System.out.println("Original array:");
		printArrayWithDiff(nums5);

		Arrays.sort(nums5, (a, b) -> Integer.compare(Math.abs(a[0] - a[1]), Math.abs(b[0] - b[1])));
		System.out.println("Sorted by absolute difference:");
		printArrayWithDiff(nums5);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Example 6: Custom sorting using Comparator.comparing()
		int nums6[][] = {
				{ 3, 4 },
				{ 1, 2 },
				{ 5, 1 },
				{ 2, 3 }
		};

		System.out.println("Example 6: Using Comparator.comparing()");
		System.out.println("Original array:");
		printArray(nums6);

		// Sort by first element using Comparator.comparing()
		Arrays.sort(nums6, Comparator.comparing(arr -> arr[0]));
		System.out.println("Sorted using Comparator.comparing():");
		printArray(nums6);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Example 7: Sort 3D-like arrays (arrays with more than 2 elements)
		int nums7[][] = {
				{ 3, 4, 1 },
				{ 1, 2, 5 },
				{ 5, 1, 2 },
				{ 2, 3, 4 }
		};

		System.out.println("Example 7: Sort arrays with 3 elements by middle element");
		System.out.println("Original array:");
		print3ElementArray(nums7);

		Arrays.sort(nums7, (a, b) -> Integer.compare(a[1], b[1])); // Sort by middle element
		System.out.println("Sorted by middle element (index 1):");
		print3ElementArray(nums7);

		System.out.println("\n" + "=".repeat(50) + "\n");

		demonstrateAllSortingMethods();
	}

	// Helper method to print 2D array
	static void printArray(int[][] arr) {
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}

	// Helper method to print array with sum
	static void printArrayWithSum(int[][] arr) {
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row) + " (sum: " + (row[0] + row[1]) + ")");
		}
	}

	// Helper method to print array with absolute difference
	static void printArrayWithDiff(int[][] arr) {
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row) + " (diff: " + Math.abs(row[0] - row[1]) + ")");
		}
	}

	// Helper method to print 3-element arrays
	static void print3ElementArray(int[][] arr) {
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}

	// Demonstrate all sorting methods
	static void demonstrateAllSortingMethods() {
		System.out.println("=== All Sorting Methods Summary ===");

		System.out.println("\n1. Ascending by first element:");
		System.out.println("Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));");

		System.out.println("\n2. Descending by first element:");
		System.out.println("Arrays.sort(nums, (a, b) -> Integer.compare(b[0], a[0]));");

		System.out.println("\n3. By second element:");
		System.out.println("Arrays.sort(nums, (a, b) -> Integer.compare(a[1], b[1]));");

		System.out.println("\n4. By sum of elements:");
		System.out.println("Arrays.sort(nums, (a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1]));");

		System.out.println("\n5. By absolute difference:");
		System.out
				.println("Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a[0] - a[1]), Math.abs(b[0] - b[1])));");

		System.out.println("\n6. Multi-level sorting (first element, then second):");
		System.out.println("Arrays.sort(nums, (a, b) -> {");
		System.out.println("    if (a[0] != b[0]) return Integer.compare(a[0], b[0]);");
		System.out.println("    return Integer.compare(a[1], b[1]);");
		System.out.println("});");

		System.out.println("\n7. Using Comparator.comparing():");
		System.out.println("Arrays.sort(nums, Comparator.comparing(arr -> arr[0]));");

		System.out.println("\n8. Reverse order using Collections.reverseOrder():");
		System.out.println("Arrays.sort(nums, Collections.reverseOrder((a, b) -> Integer.compare(a[0], b[0])));");
	}
}
