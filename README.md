This repo is based on programs in java

# Java Coding Questions - Comprehensive Collection

## Table of Contents

1. [Array Problems](#array-problems)
2. [String Manipulation](#string-manipulation)
3. [Number Series & Patterns](#number-series--patterns)
4. [Data Type Conversions](#data-type-conversions)
5. [Sorting Algorithms](#sorting-algorithms)
6. [Advanced Algorithm Problems](#advanced-algorithm-problems)
7. [TCS NQT Coding Challenges](#tcs-nqt-coding-challenges)
8. [Additional Practice Problems](#additional-practice-problems)

---

## Array Problems

### 1. Second Largest Number in Array

**Problem:** Write a program to find the second largest number in an array.

```java
public class SecondLargestInArray {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("The Second largest element in the array is: " + secondLargest);
        }
    }
}
```

### 2. Reverse Array In-Place

**Problem:** Write a program to reverse an array in-place.

```java
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array is: " + Arrays.toString(arr));
    }
}
```

### 3. Find Duplicate Values

**Problem:** Write a program to find the duplicate values of an array of integer values.

```java
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 40, 50, 50};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        System.out.println("Duplicate elements in array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }

        for (int duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
```

### 4. Count Even and Odd Numbers

**Problem:** Write a program to find the number of even and odd integers in a given array.

```java
public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[] = {10, 20, 21, 30, 31, 40, 41};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}
```

### 5. Common Elements Between Two Arrays

**Problem:** Write a program to find the common elements between two arrays.

```java
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        Set<Integer> commonElements = new HashSet<>();

        System.out.println("Common elements are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    commonElements.add(arr1[i]);
                }
            }
        }

        for (int element : commonElements) {
            System.out.println(element);
        }
    }
}
```

### 6. **NEW** - Maximum Subarray Sum (Kadane's Algorithm)

**Problem:** Find the maximum sum of contiguous subarray.

```java
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadane(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
```

### 7. **NEW** - Rotate Array by K Positions

**Problem:** Rotate an array to the right by k steps.

```java
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
```

---

## String Manipulation

### 8. Palindrome Check

**Problem:** Write a program to check whether a given string is a palindrome.

```java
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
```

### 9. Reverse Words in Sentence

**Problem:** Write a program to reverse words in each sentence without using library methods.

```java
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }

        System.out.println(reversedString.trim());
    }
}
```

### 10. Count Vowels and Consonants

**Problem:** Write a program to count vowels and consonants in a string.

```java
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
```

### 11. Anagram Check

**Problem:** Check if two strings are anagrams.

```java
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
```

### 12. Convert to Lowercase

**Problem:** Convert a string to lowercase.

```java
public class LowercaseString {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        str = str.toLowerCase();
        System.out.println("String in lowercase: " + str);
    }
}
```

### 13. **NEW** - First Non-Repeating Character

**Problem:** Find the first non-repeating character in a string.

```java
import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char result = findFirstNonRepeating(str);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // No non-repeating character found
    }
}
```

---

## Number Series & Patterns

### 14. Fibonacci Series

**Problem:** Print Fibonacci series up to n terms.

```java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
```

### 15. Prime Numbers

**Problem:** Print all prime numbers up to n.

```java
public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

### 16. Armstrong Numbers

**Problem:** Print Armstrong numbers between 1 and n.

```java
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n = 500;
        System.out.println("Armstrong numbers up to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }
}
```

### 17. Pattern Series

**Problem:** Print pattern 1, 12, 123, 1234, ... up to n.

```java
public class PatternSeries {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```

### 18. Series Sum

**Problem:** Calculate sum of series 1 + 1/2 + 1/3 + ... + 1/n.

```java
public class SeriesSum {
    public static void main(String[] args) {
        int n = 5;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            result += 1.0 / i;
        }

        System.out.println("The sum of the series is " + result);
    }
}
```

### 19. **NEW** - Perfect Numbers

**Problem:** Find all perfect numbers up to n.

```java
public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println("Perfect numbers up to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is always a divisor

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // Avoid counting the same divisor twice
                    sum += num / i;
                }
            }
        }

        return sum == num && num != 1;
    }
}
```

---

## Data Type Conversions

### 20. Decimal to Binary

**Problem:** Convert decimal number to binary.

```java
public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation of " + num + " is " + binary);

        // Manual conversion
        String manualBinary = decimalToBinaryManual(num);
        System.out.println("Manual conversion: " + manualBinary);
    }

    public static String decimalToBinaryManual(int num) {
        if (num == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }
}
```

### 21. Binary to Decimal

**Problem:** Convert binary number to decimal.

```java
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal representation of " + binary + " is " + decimal);

        // Manual conversion
        int manualDecimal = binaryToDecimalManual(binary);
        System.out.println("Manual conversion: " + manualDecimal);
    }

    public static int binaryToDecimalManual(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}
```

### 22. Decimal to Hexadecimal

**Problem:** Convert decimal to hexadecimal.

```java
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int num = 255;
        String hex = Integer.toHexString(num).toUpperCase();
        System.out.println("Hexadecimal representation of " + num + " is " + hex);
    }
}
```

### 23. Temperature Conversion

**Problem:** Convert Fahrenheit to Celsius.

```java
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 100.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f°F is equal to %.1f°C%n", fahrenheit, celsius);
    }
}
```

### 24. String to Integer

**Problem:** Convert string to integer without parseInt().

```java
public class StringToInteger {
    public static void main(String[] args) {
        String str = "123";
        int num = stringToInt(str);
        System.out.println("The integer value of " + str + " is " + num);
    }

    public static int stringToInt(String str) {
        if (str == null || str.isEmpty()) return 0;

        int num = 0;
        int sign = 1;
        int start = 0;

        // Handle negative numbers
        if (str.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (str.charAt(0) == '+') {
            start = 1;
        }

        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character: " + c);
            }
            num = num * 10 + (c - '0');
        }

        return num * sign;
    }
}
```

---

## Sorting Algorithms

### 25. Bubble Sort

**Problem:** Implement bubble sort algorithm.

```java
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping occurred, array is sorted
            if (!swapped) break;
        }
    }
}
```

### 26. Insertion Sort

**Problem:** Implement insertion sort algorithm.

```java
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Original array: " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
```

### 27. Selection Sort

**Problem:** Implement selection sort algorithm.

```java
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
```

### 28. Quick Sort

**Problem:** Implement quick sort algorithm.

```java
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
```

### 29. Merge Sort

**Problem:** Implement merge sort algorithm.

```java
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
```

---

## Advanced Algorithm Problems

### 30. Towers of Hanoi

**Problem:** Solve the Towers of Hanoi problem with n disks.

```java
public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Solution for " + n + " disks:");
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}
```

### 31. Longest Common Subsequence

**Problem:** Find the length of the Longest Common Subsequence in two strings.

```java
public class LCS {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int result = lcs(s1, s2, s1.length(), s2.length());
        System.out.println("Length of LCS is " + result);

        // Dynamic Programming approach
        int dpResult = lcsDP(s1, s2);
        System.out.println("Length of LCS (DP) is " + dpResult);
    }

    // Recursive approach
    static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m, n - 1), lcs(s1, s2, m - 1, n));
        }
    }

    // Dynamic Programming approach
    static int lcsDP(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}
```

### 32. String Permutations

**Problem:** Find all permutations of a string.

```java
import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of " + str + ":");

        List<String> permutations = new ArrayList<>();
        permute(str.toCharArray(), 0, str.length() - 1, permutations);

        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    private static void permute(char[] str, int l, int r, List<String> result) {
        if (l == r) {
            result.add(new String(str));
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i);
                permute(str, l + 1, r, result);
                swap(str, l, i); // backtrack
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

---

## Additional Practice Problems

### 33. **NEW** - Matrix Spiral Traversal

**Problem:** Print matrix elements in spiral order.

```java
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral order: " + result);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse down
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
```

### 34. **NEW** - Binary Search Implementation

**Problem:** Implement binary search algorithm.

```java
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70, 80, 90};
        int target = 10;

        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
```

### 35. **NEW** - Two Sum Problem

**Problem:** Find two numbers in array that add up to target.

```java
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
```

---

## TCS NQT Coding Challenges

_[Include all the TCS NQT problems from your original list here with proper formatting and explanations]_

### Push Zeros to End

**Problem:** Move all zeros in array to the end.

```java
import java.util.*;

public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        // Move non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (count < n) {
            arr[count++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
```

---

## Interview Tips and Best Practices

### Code Quality Guidelines

1. **Use meaningful variable names**
2. **Add proper comments for complex logic**
3. **Handle edge cases (empty arrays, null inputs)**
4. **Optimize time and space complexity**
5. **Test with different input sizes**

### Common Time Complexities

- **O(1)** - Constant time
- **O(log n)** - Logarithmic time (Binary Search)
- **O(n)** - Linear time
- **O(n log n)** - Linearithmic time (Merge Sort, Quick Sort)
- **O(n²)** - Quadratic time (Bubble Sort, Selection Sort)

### Space Complexity Considerations

- **In-place algorithms** use O(1) extra space
- **Recursive algorithms** use O(n) space for call stack
- **Dynamic programming** may use O(n) or O(n²) space for memoization

---

## Practice Resources

### Online Platforms

1. **LeetCode** - leetcode.com
2. **HackerRank** - hackerrank.com
3. **CodeChef** - codechef.com
4. **GeeksforGeeks** - geeksforgeeks.org
5. **InterviewBit** - interviewbit.com

### Books for Reference

1. **"Cracking the Coding Interview"** by Gayle McDowell
2. **"Elements of Programming Interviews"** by Aziz, Lee, and Prakash
3. **"Introduction to Algorithms"** by Cormen, Leiserson, Rivest, and Stein

---

_This comprehensive coding questions sheet covers fundamental to advanced programming concepts. Practice regularly and focus on understanding the logic behind each solution. Good luck with your coding interviews!_
