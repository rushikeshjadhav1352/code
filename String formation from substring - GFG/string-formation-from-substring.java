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
            String input = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.isRepeat(input);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution {
int isRepeat(String s)
{
int n = s.length();
int lps[] = new int[n];
lps[0] = 0;

int i = 0, j = 1;

while(j < n)
{
if(s.charAt(i) == s.charAt(j))
{
lps[j] = i + 1;
i++;
j++;
}
else
{
if(i == 0)
{
lps[j] = 0;
j++;
}
else
{
i = lps[i - 1];
}
}
}

return (lps[n - 1] > 0 && n % (n - lps[n - 1]) == 0) ? 1 : 0;
}
}