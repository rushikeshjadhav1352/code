// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int level = Integer.parseInt(a[0]);
            int pos = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            if(ob.profession(level, pos) == 'd')
                System.out.println("Doctor");
            else
                System.out.println("Engineer");
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
   static char profession(int level, int pos){
       int ln=1;
       if(level==1) return 'e';
       ln=(int) Math.pow( Double.valueOf(2), Double.valueOf(level-1));
       return dofind(ln,pos,'e');
   }
   //ps is position of char start
   //pos is position need find
   static char dofind(int ln,int pos,char start){
       if(pos<=1||ln<=1) return start;
       // length nhi phan luôn chẵn
       int T=Math.round(ln/2)%2==0?(int) Math.round(ln/2):(int) Math.floor(ln/2);
       if(pos>T){
           start=(start=='e')?'d':'e';
           pos=pos-T;
       }
       return dofind(T,pos,start);
   }
}