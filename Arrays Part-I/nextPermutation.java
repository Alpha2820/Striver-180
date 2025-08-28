import java.util.Scanner;

public class nextPermutation {
  public static void reverse(int nums[], int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public static void findNextRight(int index, int nums[]) {
    int n = nums.length - 1;
    for (int i = n - 1; i > 0; i--) {
      if (nums[i] > nums[index]) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        break;
      }
    }
  }

  public static void NextPermutation(int nums[]) {
    int n = nums.length;
    int index = -1;
    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] < nums[i + 1]) {
        index = i;
        break;
      }
      if (index == -1) {
        reverse(nums, 0, n - 1);
      }
      if (index >= 0) {
        findNextRight(index, nums);
        reverse(nums, index + 1, n - 1);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    NextPermutation(nums);
    System.out.println("The next permutation is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
    sc.close();
  }
}
