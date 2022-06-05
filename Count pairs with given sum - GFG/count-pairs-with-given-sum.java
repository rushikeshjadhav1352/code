// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> ans=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++){
         if(ans.containsKey(k-arr[i])){
             count+=ans.get(k-arr[i]);
            // ans.remove(Math.abs(k-arr[i]));
         }
         if(ans.containsKey(arr[i])){
         ans.put(arr[i],ans.get(arr[i])+1);
}else
ans.put(arr[i],1);
                
            
        }
        return count;
    }
}
