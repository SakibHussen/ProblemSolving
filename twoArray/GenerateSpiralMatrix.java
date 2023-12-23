package ProblemSolving.twoArray;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    static void printMatrix(int[][] arr){
        for (int i=0;i< arr.length ;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }

    static void spiralMatrixGenerator(int n){

        int[][] spiral=new int[n][n];
        int totalElements=0;
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int k=1;
        while(totalElements< n*n){
            for(int j=leftCol;j<=rightCol && totalElements< n * n; j++){

                spiral[topRow][j]=k;
                k++;
                //1,2,3 top row's element
                totalElements++;
            }
            topRow++;
            //right Column
            for(int i=topRow;i<=bottomRow && totalElements< n * n;i++){
                spiral[i][rightCol]=k;
                //4,5
                k++;
                totalElements++;
            }
            rightCol--;
            //Print the bottom Row
            for(int j=rightCol; j>=leftCol && totalElements< n * n;j--){
                spiral[bottomRow][j]=k;
                //6,7
                k++;
                totalElements++;
            }
            bottomRow--;
            for (int i=bottomRow;i>=topRow && totalElements< n * n;i--){
                spiral[i][leftCol]=k;
                k++;
                totalElements++;
            }
            leftCol++;
        }
        printMatrix(spiral);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of a square Matrix: ");
        int n=sc.nextInt();
        spiralMatrixGenerator(n);
    }
}
