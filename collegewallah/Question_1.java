package ProblemSolving.collegewallah;

import java.util.Arrays;

//Find out the number of occurrences in array
// arr=[5,6,5,1,5] how many time 5 is in the array
public class Question_1 {
    public static int countOccurrences(int[] arr,int x){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    //Question two given arr=5,6,5,3,5,4 the x=5, print the last occurrences
    public static int lastOccurrence(int[]arr,int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    //I f an array is sorted or not increasing order
    public static boolean isSorted(int []arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++)
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        return check;
    }
    //Question_3

    public static void smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        for (int i=0; i< arr.length;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
     int []arr={5,6,5,1,5};
//     int result=countOccurrences(arr,5);
//        System.out.println(result);
//        int result_2=lastOccurrence(arr,5);
//        System.out.println(result_2);
//        int []arr_2={1,3,2,3,4,5};
//        boolean result_3= isSorted(arr_2);
//        System.out.println(result_3);
        smallestAndLargestElement(arr);
    }
}
