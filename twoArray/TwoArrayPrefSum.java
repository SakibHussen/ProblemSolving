package ProblemSolving.twoArray;

import java.util.Scanner;

public class TwoArrayPrefSum {
    static void printMatrix(int[][] arr){
        for (int i=0;i< arr.length ;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }
    static void prefixSum(int[][]matrix){
       int r=matrix.length;
       int c= matrix[0].length;
        for (int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }
    static int findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        prefixSum(matrix);

        for(int i=l1; i<=l2;i++){
            if(r1>=1){
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }

            else{
                sum=matrix[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the rows for A: ");
        int r=sc.nextInt();
        System.out.println("Enter the column for A: ");
        int c= sc.nextInt();
        int[][] A=new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.printf("A[%d][%d]= ",i,j);
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("A: ");
        printMatrix(A);
        System.out.println("Enter the rectangle boundaries l1,r1,l2,r2 ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        System.out.println("The Sum is: ");
        System.out.println(findSum(A,l1,r1,l2,r2));
    }
}
