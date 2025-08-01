package BASIC;

public class NaturalSum {
	public static void table(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(n * i);
		}
	}

	public static void main(String[] args) {
		int n = 5, sum = 0;
		for (int i = 0; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);
		table(5);
	}
}
