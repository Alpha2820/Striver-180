import java.util.*;

public class StockBuyAndSell {

  public static int maxProfit(int prices[]) {
    int maxProfit = 0;
    int left = 0;
    int right = 1;
    while (right < prices.length) {
      if (prices[left] < prices[right]) {
        maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
      } else {
        left = right;
      }
      right++;
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n = sc.nextInt();
    int prices[] = new int[n];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < n; i++) {
      prices[i] = sc.nextInt();
    }
    int ans = maxProfit(prices);
    System.out.println("The maximum profit is : " + ans);
    sc.close();
  }

}
