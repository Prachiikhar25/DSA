package BASIC;

import java.util.*;

public class ChutmutPrograme {
    static void GCD(int a, int b) {

        int ans = 1;
        for (int i = 1; i < Math.min(a, b); i++) {
            if ((a % i == 0) && (b % i == 0)) {
                ans = i;
            }
        }
        System.out.println("The GCD is :" + ans);
    }

    static void EuclideanGCD(int a, int b) {
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD BY EUCLIDEAN IS " + a);
    }

    static void CheckPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = st.length();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != st.charAt(n - 1 - i)) {
                System.out.println("nahi hai ");
                break;
            }
        }
        System.out.println("Hai pali");
        System.out.println(s);
        System.out.println(st);
    }

    static void CompareString(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.println("Case ni dekhte compare to");
        } else {
            System.out.println("Case dekhte hai");
        }

    }

    public static void main(String args[]) {
        GCD(27, 90);
        EuclideanGCD(12, 18);
        CheckPalindrome("Too hot to hoot");
        CompareString("HI", "hi");

    }
}