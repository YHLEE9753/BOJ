package A20_Division;

import java.util.Scanner;

public class A6_MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] matrix1 = new int[n1][m1];
        for(int i = 0;i<n1;i++){
            for(int j = 0;j<m1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] matrix2 = new int[n2][m2];
        for(int i = 0;i<n2;i++){
            for(int j = 0;j<m2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<n1;i++){
            for(int j = 0;j<m2;j++){
                int result = 0;
                for(int k = 0;k<m1;k++)
                    result += matrix1[i][k]*matrix2[k][j];
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
