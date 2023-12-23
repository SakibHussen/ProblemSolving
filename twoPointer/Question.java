package ProblemSolving.twoPointer;

public class Question {
    static int[] sortingZeros(int[] arr){
        int zerosCount=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]==0){
                zerosCount++;
            }
        }
        for(int i=0;i< arr.length;i++){
            if(i<zerosCount){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,0,0,1,0,1,1,0,0};
        sortingZeros(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
