import java.util.*;

public class rotateMatrix {
  public static void RotateMatrix(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][n - j - 1];
        arr[i][n - j - 1] = temp;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int rows = sc.nextInt();
    System.out.println("Enter number of columns");
    int cols = sc.nextInt();
    int arr[][] = new int[rows][cols];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    RotateMatrix(arr);
    System.out.println("The rotated matrix is : ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }

}
