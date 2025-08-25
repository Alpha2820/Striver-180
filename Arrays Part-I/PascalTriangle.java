import java.util.*;

public class PascalTriangle {

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> output = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    output.add(arr);
    for (int row = 2; row <= numRows; row++) {
      ArrayList<Integer> temp = new ArrayList<>();
      temp.add(1);
      for (int col = 1; col < row - 1; col++) {
        int val = output.get(row - 2).get(col - 1) + output.get(row - 2).get(col);
        temp.add(val);
      }
      temp.add(1);
      output.add(temp);
    }
    return output;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int numRows = sc.nextInt();
    List<List<Integer>> ans = generate(numRows);
    System.out.println("The pascal triangle is : ");
    for (int i = 0; i < ans.size(); i++) {
      for (int j = 0; j < ans.get(i).size(); j++) {
        System.out.print(ans.get(i).get(j) + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
