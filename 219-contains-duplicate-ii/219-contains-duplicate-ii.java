class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> ans=new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
           if(ans.containsKey(nums[i])){
               //int sum=ans.get(nums[i]);
               if(Math.abs(ans.get(nums[i])-i)<=k){
                       return true;
                   }
           }
           ans.put(nums[i],i);
             
           
       } 
       
        
return false;
    }
}