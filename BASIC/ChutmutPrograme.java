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

    public static void main(String args[]) {
        GCD(27, 90);
        EuclideanGCD(12, 18);
    }
}