// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        return findPathrus(m,0,0,n,"");
    }
    public static ArrayList<String> findPathrus(int matrix[][],int row,int column,int length,String str){
        if(matrix[length-1][length-1]==0){
             ArrayList<String> ans=new ArrayList<String>();
            ans.add("-1");
            return ans;
        }
        if(row==length-1 && column==length-1){
            ArrayList<String> list=new ArrayList<String>();
            list.add(str);
            return list;
        }
        if(matrix[row][column]==0){
            ArrayList<String> ans=new ArrayList<String>();
            
            return ans;
        }
        matrix[row][column]=0;
        ArrayList<String> list=new ArrayList<String>();
        if(row>0){
            list.addAll(findPathrus(matrix,row-1,column,length,str+"U"));
        }
         if(row<length-1){
            list.addAll(findPathrus(matrix,row+1,column,length,str+"D"));
        }
         if(column>0){
            list.addAll(findPathrus(matrix,row,column-1,length,str+"L"));
        }
         if(column<length-1){
            list.addAll(findPathrus(matrix,row,column+1,length,str+"R"));
        }
        matrix[row][column]=1;
        
        return list;
        
    }
    
}