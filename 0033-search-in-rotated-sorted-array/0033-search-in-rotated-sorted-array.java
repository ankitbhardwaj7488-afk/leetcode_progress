class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }

        int rotationindex=findrotatin(nums);
        if(nums[rotationindex]== target){
            return rotationindex;
        }
        int n =nums.length;
        int low,high;

        if(target>=nums[rotationindex]&& target<= nums[n-1]){
            low=rotationindex;
            high=n-1;
        }
        else{
            low=0;
            high=rotationindex-1;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
    public int findrotatin(int [] nums ){
        int low=0;
        int high = nums.length-1;

        while(low < high){
            int mid = low +(high-low)/2;
            if(nums[mid] >= nums[0]){
                low=mid+1;
            }
            else{
                high=mid;
            }

        }
        return low;
    }
}