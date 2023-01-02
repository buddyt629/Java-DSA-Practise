public class PascalTriangle {
  public static void main(String[] args) {
    int rows = 5;
    int[][] triangle = new int[rows][];

    for (int i = 0; i < rows; i++) {
      triangle[i] = new int[i + 1];
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          triangle[i][j] = 1;
        } else {
          triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
      }
    }

    for (int[] row : triangle) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
