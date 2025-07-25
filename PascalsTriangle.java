import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] triangle = new int[rows][rows];

        


        for (int i = 0; i < rows; i++) {
            triangle[i][0] = 1; 

            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        
        for (int i = 0; i < rows; i++) {
            
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
