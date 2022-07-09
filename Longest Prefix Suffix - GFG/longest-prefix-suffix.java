// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        // code here
        int a[]=new int[s.length()];
        int i=1;
        int j=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                a[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j==0){
                    i++;
                }else{
                    j = a[j-1];
                }
            }
        }
        return a[s.length()-1];
    }
}