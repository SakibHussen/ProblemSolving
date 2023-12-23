package ProblemSolving.collegewallah;
//Find the  total number of pairs whose sum is equal to the given value X;

public class Question_2 {
    public static int targetSum(int []arr,int x){
        int ans=0;
        for (int i=0; i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]+arr[j]==x){
                   ans++;
                }
            }
        }
        return ans;
    }
    //Find the number of triplets whose sum is equal to the given value X
    public static int tripletSum(int[]arr,int target){
        int ans=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//    int [] arr={4,6,3,5,8,2};
//        System.out.println(targetSum(arr,7));

        int []arr={1,4,5,6,3};
        System.out.println(tripletSum(arr,12));
    }
}
