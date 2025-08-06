package BASIC;

public class Bit {
	static void GetBit(int n, int pos) {
		int bitMask = 1 << pos;
		if ((bitMask & n) != 0) {
			System.out.println("At pos " + pos + " the bit is 1");
		} else {
			System.out.println("At pos " + pos + " the bit is 0");

		}
	}

	static void SetBit(int n, int pos) {
		int bitMask = 1 << pos;
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	}

	static void ClearBit(int n, int pos) {
		int bitMask = 1 << pos;
		int not = ~(bitMask);
		System.out.println(not & n);
	}

	public static void main(String[] args) {
		GetBit(5, 2);// at pos get if the digit is 0 or 1
		SetBit(5, 1);
		ClearBit(5, 2);
	}
}
