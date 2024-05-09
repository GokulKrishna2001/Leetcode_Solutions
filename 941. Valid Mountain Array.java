class Solution {
    public boolean validMountainArray(int[] arr) {
        int counter=1;
        int length=arr.length;
        if(length<3)
            counter=0;
        else
        {
            int i,j=0;
            for(i=0;i<length-1;i++)
            {
                if(arr[i]>arr[i+1])
                    break;
                else if(arr[i]==arr[i+1])
                {
                    counter=0;
                    break;
                }
            }
            if(i==0 || i==length-1)
                counter=0;
            else
            {
                for(i=i;i<length-1;i++)
                {
                    if(arr[i]<arr[i+1] || arr[i]==arr[i+1])
                    {
                        counter=0;
                        break;
                    }
                }
            }
        }
        if(counter==1)
            return true;
        else
            return false;
    }
}
