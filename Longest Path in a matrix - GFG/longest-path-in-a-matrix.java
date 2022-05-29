// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n  = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S2[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.longestIncreasingPath(matrix);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
        int[][]direction = {{0,1},{1,0}, {0,-1}, {-1, 0}};

     int dfs(int i, int j, int n, int m, int[][]arr, int[][]dp){
        int max=0;
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        for(int[] dir : direction){
            int x = i + dir[0];
            int y = j + dir[1];

            if(x<0 || y<0 || x>=n || y>=m || arr[x][y] <= arr[i][j]){
                continue;
            }

            int len = 1 + dfs(x, y, n, m, arr, dp);

            max = Math.max(max, len);
        }

        return dp[i][j] = max;
    }
    
    public int longestIncreasingPath(int[][] arr)
    {
        // Code here 
        int n = arr.length;
        int m = arr[0].length;
        int max=0;
        
        int[][]dp = new int[n][m];
        
        for(int[]row : dp){
            Arrays.fill(row, -1);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int len = dfs(i,j,n,m,arr, dp);

                max = Math.max(max, len);
            }
        }
        return max+1;
    
    }
}