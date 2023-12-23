package ProblemSolving.twoArray;

import java.util.Scanner;

public class ArrayMultiplication {
    static void arrayMultiplication(int[][]a,int[][]b,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("The inner dimension are not equal.");
            return;
        }
        int[][]result=new int [r1][c2];//outer dimension
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    result[i][j]+=a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The Multiplication of Array: ");
      printMatrix(result);
    }
    static void printMatrix(int[][] arr){
        for (int i=0;i< arr.length ;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows for A: ");
        int r1=sc.nextInt();
        System.out.println("Enter the column for A: ");
        int c1= sc.nextInt();
        System.out.println("Enter the rows for B: ");
        int r2=sc.nextInt();
        System.out.println("Enter the column for B: ");
        int c2= sc.nextInt();
        int[][] A=new int[r1][c1];
        int[][] B= new int[r2][c2];

        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.printf("A[%d][%d]= ",i,j);
                A[i][j]= sc.nextInt();
            }

        }

        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                System.out.printf("B[%d][%d]= ",i,j);
                B[i][j]= sc.nextInt();
            }

        }
        System.out.println("A: ");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.print(" "+A[i][j]);

            }
            System.out.println();
        }
        System.out.println("B: ");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){

                System.out.print(" "+B[i][j]);
            }
            System.out.println();
        }
        arrayMultiplication(A,B,r1,c1,r2,c2);
    }

}
