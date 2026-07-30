class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int a=numbers[l]+numbers[r];
                if(a>target){
                    r--;
                }else if(a<target){
                    l++;
                }else{
                    return new int[]{l+1,r+1};
                }
            }
        
        return new int[0];
    }
}

