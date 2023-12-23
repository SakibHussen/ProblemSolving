package ProblemSolving.twoArray;

import java.util.Scanner;

public class TransposeMatrix {
    static void printMatrix(int[][] arr){
        for (int i=0;i< arr.length ;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }
    static int[][] matrixTranspose(int[][]arr,int n){

        int[][] ans=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
               ans[i] [j]=arr[j][i];
            }
        }
       return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the rows for A: ");
        int r1=sc.nextInt();
        System.out.println("Enter the column for A: ");
        int c1= sc.nextInt();
        int[][] A=new int[r1][c1];

        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.printf("A[%d][%d]= ",i,j);
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("A: ");
        printMatrix(A);
       int[][] ans=matrixTranspose(A,r1);
        System.out.println("Transpose of A: ");
        printMatrix(ans);

    }
}
