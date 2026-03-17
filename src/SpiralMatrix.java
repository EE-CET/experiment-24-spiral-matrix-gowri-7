import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows");
        int r = sc.nextInt();
        System.out.print("enter no of columns");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("enter element");
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        while(top <= bottom && left <= right) {

            // top row
            for(int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // right column
            for(int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // bottom row
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            // left column
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}
