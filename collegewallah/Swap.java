package ProblemSolving.collegewallah;

public class Swap {
    static void swap(int a, int b){
        int sum= a+b;
        int sub=a-b;
        b=(sum+sub)/2;
        a=(sum-sub)/2;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
//Riversing an Array
    static int[] reverseArray(int[] arr){
        int[]ans=new int[arr.length];
        int j=0;
        for (int i= arr.length-1;i>=0;i--){


                ans[j]=arr[i];
                  j++;



        }
        return ans;

    }
    //inplace reverse without using new array

    public static void main(String[] args) {
//        int a=9;
//        int b=3;
//        swap(a,b);
        int []arr={1,2,3,4,5};
       int[] ans=reverseArray(arr);
       for (int i=0; i< arr.length;i++){
           System.out.print(ans[i] + " ");
       }
    }
}
