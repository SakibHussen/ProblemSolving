package ProblemSolving.prefixSum;

import java.util.Scanner;

public class RangeQuery {
    static int[] makePrefixSumArray(int[]arr){
//        int[] pref= new int[arr.length]; the question said not to use any additional array
//        pref[0]=arr[0];
        for(int i=1; i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i];

        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int size=sc.nextInt();
        int[]arr= new int[size+1];
        for(int i=1; i<=size;i++){
            arr[i]= sc.nextInt();
        }
        int[] prefixSum=makePrefixSumArray(arr);
        System.out.println("Enter number of queries: ");
        int q= sc.nextInt();
        while (q-->0){
            System.out.println("Entar range: ");
            int l= sc.nextInt();
            int r= sc.nextInt();
            int ans= prefixSum[r]-prefixSum[l-1];
            System.out.println("Sum "+ans);
        }
    }
}
