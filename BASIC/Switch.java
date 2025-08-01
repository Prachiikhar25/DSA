package BASIC;

import java.util.*;

public class Switch {
	public static void main(String args[]) {
		// Calculator
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter operator");
		char ch = sc.next().charAt(0);
		switch (ch) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			default:
				System.out.println("Invalid");
		}
		sc.close();
	}
}
