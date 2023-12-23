package ProblemSolving.twoPointer;

public class Question4 {
    static void swap(int[]arr,int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int[] arr){
      int n= arr.length;
      int left=0, right=n-1;
      int[] ans= new int[n];
      int k=0;
      while(left<=right){
          if(Math.abs(arr[left])> Math.abs(arr[right])){
              ans[k]=arr[left]*arr[left];
              k++;//if it said decreasing order than k--
              left++;
          }else{
              ans[k]= arr[right]*arr[right];
              k++;
              right--;
          }
      }
      return ans;
    }

    public static void main(String[] args) {
        int [] arr={-10,-3,-2,1,4,5};
        int[] ans=sortSquares(arr);
       reverse(ans);
        for (int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
