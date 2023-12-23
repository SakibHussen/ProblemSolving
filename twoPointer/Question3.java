package ProblemSolving.twoPointer;

public class Question3 {

    static void swap(int[]arr,int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //parity means whether a number is even or odd

    static void sortArrayByParity(int []arr){
      int n= arr.length;
      int left=0, right=n-1;
      while(left<right){
          if(arr[left] % 2==1 && arr[right] %2==0){
              swap(arr,left,right);
              left++;
              right--;

          }if(arr[left]%2==0){ //if the left side number is even than it will be unchanged
              left++;
          }if(arr[right] %2==1){
              right--;
          }
      }
    }

    public static void main(String[] args) {
        int [] arr={1,3,3,4,5,6};
        sortArrayByParity(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
