class Solution {
    public void moveZeroes(int[] nums) {
        int new1 = 0;

        for(int j = 0;j<nums.length;j++){
            
            if(nums[j]!= 0){
                int temp = nums[j];
                nums[j] = nums[new1];
                nums[new1]  = temp;
                new1++;

            }
        }
       
    }
} 