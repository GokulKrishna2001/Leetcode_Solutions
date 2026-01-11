class Solution {
    public int[] sortedSquares(int[] nums) {
        int sqr[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        //keeping 2 pointers on either side and adding it from the back of the new array
        for(int i=nums.length-1;i>=0;i--)
        {
            //check if the abs value of the left is greater than the right one
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                sqr[i]=nums[left] * nums[left];
                left++;
            }
            else
            {
                sqr[i]=nums[right] * nums[right];
                right--;
            }
        }
        return sqr;
    }
}
