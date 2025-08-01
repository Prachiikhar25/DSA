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

	public static void main(String[] args) {
		p1(5);// hollow rectangle
		p2(5);// pyramid
		p3(5);// inverted pyramid
		p4(5);// inverted half pyramid
		p5(5);
		p6(5);
		p7(5);

	}
}
