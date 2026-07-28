class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums)
        {
            s.add(num);
        }
       int l=0;
       for(int num:s){
        if(!s.contains(num-1)){
            int leng=1;
            while(s.contains(num+leng)){
                leng++;
            }
            l=Math.max(l,leng);
        }
       }
       return l;
    }
}
