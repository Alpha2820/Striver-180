import java.util.*;

public class SortZeroOneTwo {

  public static void sortZeroOneTwo(int arr[]) {
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        count0++;
      } else if (arr[i] == 1) {
        count1++;
      } else if (arr[i] == 2) {
        count2++;
      }
    }
    for (int i = 0; i < count0; i++) {
      arr[i] = 0;
    }
    for (int i = count0; i < count0 + count1; i++) {
      arr[i] = 1;
    }
    for (int i = count0 + count1; i < arr.length; i++) {
      arr[i] = 2;
    }
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
    sortZeroOneTwo(arr);
    System.out.println("The sorted array is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
