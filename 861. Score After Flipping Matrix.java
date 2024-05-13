import java.lang.Math;
class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length;//for rows
        int n=grid[0].length;//for columns
        int maxval=0;
        int [] max=new int[m];
        int i,j,counter,ones,zeroes;
        // if(m==1 && n==1)
        // {
        //     if(grid[0][0]==0)
        //         return 1;
        //     else
        //         return 0;
        // }
        //flipping each rows which starts with 0
        for(i=0;i<m;i++)
        {
            counter=0;
            if(grid[i][0]==0)
                counter=1;
            
            if(counter==1)
            {
                for(j=0;j<n;j++)
                {
                    if(grid[i][j]==1)
                        grid[i][j]=0;
                    else 
                        grid[i][j]=1;
                    //max[i]+=grid[i][j]*Math.pow(2,n-j);
                }
            }
        }
        //checking each columns to see if number of 0s>1, if yes, then flip
        for(i=0;i<n;i++)
        {
            ones=0;
            zeroes=0;
            for(j=0;j<m;j++)
            {
                if(grid[j][i]==1)
                    ones++;
                else
                    zeroes++;
            }
            if(zeroes>ones)//flipping is to be done
            {
                for(j=0;j<m;j++)
                {
                    if(grid[j][i]==0)
                        grid[j][i]=1;
                    else
                        grid[j][i]=0;    
                }
            }
        }
        //adding the binary row sum
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                max[i]+=grid[i][j]*Math.pow(2,n-j-1);
            maxval+=max[i];
        }
        return maxval;
    }
}
