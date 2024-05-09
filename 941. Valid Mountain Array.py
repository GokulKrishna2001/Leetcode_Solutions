class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        length=len(arr)
        counter=1
        if(length<3):
            counter=0
        else:
            for i in range(0,length-1):
                if(arr[i]>arr[i+1]):
                    break
                elif(arr[i]==arr[i+1]):
                    counter=0
                    break
            
            if(i==0 or i==length-1):
                counter=0
            else:
                for j in range(i,length-1):
                    if(arr[j]<arr[j+1] or arr[j]==arr[j+1]):
                        counter=0
                        break
        if(counter==1):
            return True
        else:
            return False
