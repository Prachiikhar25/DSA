public class SumOfSubArrays {
	public static int sumofsubarray(int arr[]) {
		// arr[i]kitney baar aayega? har sub arraya mai-->n-i times
		// aur It can be part of subarrays starting from index 0 to i → (i + 1) choices
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i] * (n - i) * (i + 1);
		}
		return sum;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		int ans = sumofsubarray(arr);
		System.out.println(ans);
	}
}