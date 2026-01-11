class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //check if n==0
        if(n==0)
            return;
        else
        {
            //taking the last index of nums1
            int lastId=nums1.length-1;
            //repeat while both the elements are in nums1 and nums1 length is not 0
            while(n>0 && m>0)
            {
                //check if nums2 value is >= nums1 value
                if(nums2[n-1]>=nums1[m-1])
                {
                    nums1[lastId]=nums2[n-1];
                    n--;
                }
                else
                {
                    nums1[lastId]=nums1[m-1];
                    m--;
                }
                lastId--;
            }
            //if m was 0 and there are elements in nums2, we have to add it to nums1
            while(n>0)
            {
                nums1[lastId]=nums2[n-1];
                n--;
                lastId--;
            }
        }
    }
}
