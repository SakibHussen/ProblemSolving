package ProblemSolving.Leetcode;

public class FindMissing {
   static int [] findMisssingAndRepitative(int[][]grid){

    int n=grid.length;
    int []ct= new int[n*n+1];
     for (int i=0;i<n;i++){
       for(int j=0;j<n;j++){
     //  System.out.println(grid[i][j]);
        ct[grid[i][j]]++;
      // System.out.print(ct[grid[i][j]]+" ");
      }

     }

      int []ans=new int[2];
     for(int i=1; i<=n*n;i++){
     if(ct[i]==2){
       ans[0]=i;
     }else if(ct[i]==0){
      ans[1]=i;
     }
     }

     return ans;
    }
    public static void main(String[] args) {
     int [][]arr={ {1,3},
             {2,2}};

    int[] result=findMisssingAndRepitative(arr);
    for (int i=0; i< result.length;i++){
     System.out.println(result[i]);
    }

    }
}
