package ProblemSolving.prefixSum;

public class CompareSum {
    static int findArraySum(int[]arr){
        int totalSum=0;
        for(int i=0; i<arr.length;i++){
            totalSum+=arr[i];

        }
        return totalSum;
    }
    static boolean equalSumPartition(int[]arr){
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for (int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int sufSum=totalSum-prefSum;
            if (prefSum==sufSum){
                return true;
            }
        }
        return false;
    }
}
