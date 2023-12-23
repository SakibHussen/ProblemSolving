package ProblemSolving.twoArray;

import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int[][] arr){
        for (int i=0;i< arr.length ;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow=0, bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElemnts=0;
         while(totalElemnts < r * c){
             //top row -> leftCol to rightCol

                for(int j =leftCol;j<=rightCol && totalElemnts < r * c ;j++){
                    System.out.print(matrix[topRow][j]+" ");
                    totalElemnts++;
                }
                topRow++;

             //RightCol->>TopRow to Bottom Row
               for (int i=topRow;i<=bottomRow && totalElemnts < r * c;i++){
                   System.out.print(matrix[i][rightCol]+" ");
                   totalElemnts++;
               }
               rightCol--;
             //BottomRow->>> right column to leftColumn
                for(int j=rightCol;j>=leftCol&& totalElemnts < r * c;j--){
                    System.out.print(matrix[bottomRow][j]+" ");
                    totalElemnts++;
                }
                bottomRow--;
             //leftColumn->>>>BottomRow to Top Row
             for (int i=bottomRow;i>=topRow && totalElemnts < r * c;i--){
                 System.out.print(matrix[i][leftCol]+" ");
                 totalElemnts++;
             }
             leftCol++;
         }

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
        printSpiralOrder(A,r1,c1);
    }
}
