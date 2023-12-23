package ProblemSolving.collegewallah;

public class ArrayManipulation {
    //given arr=1,2,3,4,2,1,3 find the 4
    public static int findUnique(int[]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,2,1,3,4,5};
        System.out.println(findUnique(arr));
    }
}
