package ProblemSolving;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={5,1,6,2,4,3};

        for (int i=0;i<a.length;i++){
            int temp,j;
            j=i;
            temp=a[i];
            while(j>0 && a[j-1]>a[temp]){
                a[j]=a[j-1];
                j=j=1;
            }
               a[j] =temp;
        }
    }
}
