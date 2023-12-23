package ProblemSolving.twoPointer;
//this more optomized
public class Question2 {
    static void swap(int[]arr,int a,int b){
        int c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
    static int[] swapingZerosAndOnes(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }  if (arr[left] == 0) {
                left++;
            }if(arr[right] == 1){
                right--;
            }
        }
    return arr;
}

    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,0,1,1,0};
        swapingZerosAndOnes(arr);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

  }
