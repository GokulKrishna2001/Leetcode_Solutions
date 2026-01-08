class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrMap=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            //takes the complement of the number
            int complement=target - nums[i];
            if(arrMap.containsKey(complement))
                return new int[] {arrMap.get(complement),i};
            arrMap.put(nums[i],i);//stores it as {complement=index value}
            /*
            example for {1,2,3,4}, target=6
            at 1, complement=5 and index=0 => {1=0}
            at 2, complement=4 and index=1 => {1=0,2=1}
            at 3, complement=3 and index=2 => {1=0, 2=1, 3=2}
            at 4, complement=2 and index=3, here, the complement matches to the key 2 in 2=1
            and thus returns, index=1 and i, which is 3=> {1,3}*/
        }
        return new int[]{}; //if no solution is there
    }
}
