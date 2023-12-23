package ProblemSolving.collegewallah;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    static void printArray(int []arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[5];

     for (int i=0; i<arr.length;i++){
         System.out.println(" Enter the "+i+" th element: ");
         arr[i]= sc.nextInt();
     }
        printArray(arr);

        System.out.println();

      //int[] arr_2= arr.clone();//trying to copy arr to arr_2
        //Another way
        int []arr_2= Arrays.copyOf(arr,arr.length);
        System.out.println("Copied Array two: ");
        printArray(arr_2);

        System.out.println();

// changing some values in array_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("The original values: ");
        printArray(arr);
        System.out.println();
        System.out.println("After changing the value : ");

        printArray(arr_2);
    }
}
