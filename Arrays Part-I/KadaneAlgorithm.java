import java.util.*;

public class KadaneAlgorithm {

  public static int maxSum(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      if (sum > maxSum) {
        maxSum = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = maxSum(arr);
    System.out.println("The maximum sum of contiguous subarray is : " + ans);
    sc.close();
  }
}
