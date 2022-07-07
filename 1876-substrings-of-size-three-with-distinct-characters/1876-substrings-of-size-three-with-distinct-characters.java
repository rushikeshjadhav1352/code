class Solution {
    public int countGoodSubstrings(String s) {
        int i=0;  int res=0;  int j=3;
        Set<Character>characterSet= null;
   while(j<=s.length()){
    String subString=s.substring(i,j);
    characterSet= new HashSet<>();
       for(int k=0;k<subString.length();k++){
          characterSet.add(subString.charAt(k));
          }
      if(characterSet.size()==3)
       res++;
    
    j++;
    i++;
}
        return res;
    }
}