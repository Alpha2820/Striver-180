public class SetMatrixZero {
  public static void SetMatrixZero(int arr[][])
  {
    int rows = arr.length;
    int cols = arr[0].length;
    boolean row[] = new boolean[rows];
    boolean col[] = new boolean[cols];
    for(int i = 0 ; i<rows ; i++)
    {
      for(int j = 0 ; j<cols ; j++)
      {
        if(arr[i][j] == 0)
        {
          row[i] = true;
          col[j] = true;
        }
      }
    }
    for(int i = 0 ; i<rows ; i++)
    {
      for(int j = 0 ; j<cols ; j++)
      {
        if(row[i] || col[j])
        {
          arr[i][j] = 0;
        }
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int rows = sc.nextInt();
    System.out.println("Enter number of columns");
    int cols = sc.nextInt();
    int arr[][] = new int[rows][cols];
    System.out.println("Enter the elements of the array");
    for(int i = 0 ; i<rows ; i++)
    {
      for(int j = 0 ; j<cols ; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    SetMatrixZero(arr);
    System.out.println("The modified array is : ");
    for(int i = 0 ; i<rows ; i++)
    {
      for(int j = 0 ; j<cols ; j++)
      {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
