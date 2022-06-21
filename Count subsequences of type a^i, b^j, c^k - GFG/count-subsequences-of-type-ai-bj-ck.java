// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int fun(String s) {
       final long MOD = 1000000007;
       int n = s.length();
       long[][] dp = new long[n + 1][3];
       for (int i = 1; i <= n; i += 1) {
           // copy all previous values
           dp[i][0] = dp[i - 1][0];
           dp[i][1] = dp[i - 1][1];
           dp[i][2] = dp[i - 1][2];
           switch(s.charAt(i - 1)) {
               case 'a':
                   // a' = 2a + 1
                   dp[i][0] = ((dp[i - 1][0] % MOD) +
                   (dp[i - 1][0] % MOD) + 1) % MOD;
                   break;
               case 'b':
                   // b' = 2b + a
                   dp[i][1] = ((dp[i - 1][1] % MOD)
                   + (dp[i - 1][1] % MOD) + (dp[i - 1][0] % MOD)) % MOD;
                   break;
               case 'c':
                   // c' = 2c + b
                   dp[i][2] = ((dp[i - 1][2] % MOD)
                   + (dp[i - 1][2] % MOD) + (dp[i - 1][1] % MOD)) % MOD;
                   break;
               default:
                   throw new RuntimeException("Mod with 10^9 + 7 sucks !");
           }
       }
       return (int)(dp[n][2] % MOD);
   }
}