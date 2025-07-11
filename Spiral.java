public class Spiral {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int val = 1, top = 0, bottom = 2, left = 0, right = 2;

        while (val <= 9) {
            for (int i = left; i <= right; i++) a[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) a[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) a[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) a[i][left] = val++;
            left++;
        }

        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
