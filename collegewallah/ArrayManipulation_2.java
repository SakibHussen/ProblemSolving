package ProblemSolving.collegewallah;

public class ArrayManipulation_2 {
    //find the largest number in an Array
    public static int findMax(int []arr){
        int max= Integer.MIN_VALUE;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }
    //Find the second largest maximum in the array
    static int findSecondMax(int[] arr){
        int max=findMax(arr);

        for(int i=0;i< arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr={10,10,5,8,3};
        System.out.println(findSecondMax(arr));
    }
}
