class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod= nums[0];
        int answer = nums[0];

        for(int i =1 ; i<nums.length ; i++){
            int current =nums[i];
            int newMax = Math.max(current ,Math.max(maxprod*current, minprod*current));
            int newMin = Math.min(current,Math.min(maxprod*current, minprod*current));

            maxprod=newMax;
            minprod=newMin;

            answer= Math.max(answer,maxprod);
        }
        return answer;
        
    }
}