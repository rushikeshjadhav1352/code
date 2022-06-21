class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> ans=new HashSet<Integer>();
        for(int i:nums){
            if(ans.contains(i)){
                return i;
            }
            else
                ans.add(i);
        }
        return -1;
    }
}