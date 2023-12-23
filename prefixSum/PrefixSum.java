package ProblemSolving.prefixSum;

public class PrefixSum {
    static int[] makePrefixSumArray(int[]arr){
//        int[] pref= new int[arr.length]; the question said not to use any additional array
//        pref[0]=arr[0];
        for(int i=1; i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i];

        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr={2,1,3,4,5};
      int [] prefixSum= makePrefixSumArray(arr);
        for (int i=0;i<prefixSum.length;i++){
            System.out.print(prefixSum[i]+" ");
        }
    }
}
