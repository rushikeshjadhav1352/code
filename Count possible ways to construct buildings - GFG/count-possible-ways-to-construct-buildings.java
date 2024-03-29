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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod = 1000000007;
    
    public int TotalWays(int n)
    {
        // Code here
        
        long couB=1, couS=1, preB, preS;
        
        for(int i=2; i<=n; i++){
            preB = couB;
            preS = couS;
            
            couS = (preB + preS)% mod;
            couB = preS;
        }
        
        long res =(couB % mod + couS %mod) % mod;
        
        return (int)(res % mod * res % mod) % mod;
    }
}