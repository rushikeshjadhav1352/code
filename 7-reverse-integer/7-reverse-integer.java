class Solution {
    public int reverse(int temp) {
        int a = 0,x = Math.abs(temp);
        if(temp==0||x<0)
            return 0;
        StringBuffer sb = new StringBuffer();
        while(x!=0){
            sb.append(x%10);
            x = x/10;
        }
        
        if(sb.length()==10&&sb.toString().compareTo(Integer.MAX_VALUE+"")>0)
        return 0;
        else
            a = Integer.parseInt(sb.toString());
        if(temp<0)
            a = -a;
        return a;
    }
}