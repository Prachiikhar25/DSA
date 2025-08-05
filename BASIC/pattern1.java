package BASIC;

public class pattern1 {
	public static void p1(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == 0 || i == n - 1)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	static void p2(int n) {
		// pyramid
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void p3(int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void p4(int n) {
		// fliiped half pyramid
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = n - i - 1; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void p5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	static void p6(int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	public static void p7(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	public static void p8(int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i + j) % 2 == 0 || (i + j) == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

	public static void p9(int n) {
		int[][] arr = new int[n][n]; // store pascal values

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void p10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			for (int j = 2 * (n - i); j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p11(int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p12(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
	}

	public static void p13(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void p14(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= 2 * (i - 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= 2 * (i - 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		p1(5);// hollow rectangle
		p2(5);// pyramid
		p3(5);// inverted pyramid
		p4(5);// inverted half pyramid
		p5(5);
		p6(5);
		p7(5);// Floyd's Triangle
		p8(5);
		p9(5);// Pascal's Triangle
		p10(5);// butterfly
		p11(5);// solid rhombus
		p12(5);// Number Pyramid
		p13(5);// Palindromic Pattern
		p14(5);// Daimond

	}
}

// public static void p9(int n) {
// int[][] arr = new int[n][n]; // store pascal values

// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// if (j == 0 || j == i) {
// arr[i][j] = 1;
// } else {
// arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
// }
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }
