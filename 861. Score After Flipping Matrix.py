class Solution:
    def matrixScore(self, grid: List[List[int]]) -> int:
        m=len(grid)
        n=len(grid[0])
        maxval=0
        maxlist=[0]*m
        for i in range(0,m):
            counter=0
            if(grid[i][0]==0):
                counter=1
            
            if(counter==1):
                for j in range(0,n):
                    if(grid[i][j]==1):
                        grid[i][j]=0
                    else:
                        grid[i][j]=1
        for i in range(0,n):
            ones=0
            zeroes=0
            for j in range(0,m):
                if(grid[j][i]==1):
                    ones=ones+1
                else:
                    zeroes=zeroes+1
            if(zeroes>ones):
                for j in range(0,m):
                    if(grid[j][i]==0):
                        grid[j][i]=1
                    else:
                        grid[j][i]=0
        for i in range(0,m):
            for j in range(0,n):
                maxlist[i]=maxlist[i]+grid[i][j]*(2**(n-j-1))
            maxval=maxval+maxlist[i]
        return maxval

