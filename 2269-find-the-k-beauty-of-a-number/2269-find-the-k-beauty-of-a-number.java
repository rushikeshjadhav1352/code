class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=String.valueOf(num);
        int i=0;
        int count=0;
        int j=k;
        while(i<str.length()-k+1){
           int sum=Integer.parseInt(str.substring(i,j+i));
            
           if(sum!=0) 
          if(num%sum==0){
              ++count;
          }
            ++i;
        }
        return count;
        
    }
}