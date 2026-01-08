class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=0;
        for(int i=0;i<prices.length;i++)
        {
            if(i==0 || (prices[i] < min))
                min=prices[i];
            else //compares the current highest value with the (current array value - min value)
                max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
