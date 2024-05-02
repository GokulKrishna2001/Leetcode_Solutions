class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        chars=[0]*26
        counter1=0
        counter2=0
        for i in range(0,len(sentence)):
            for j in range(0,26):
                if(sentence[i]==chars[j]):
                    counter1=1
                    #break
            if(counter1==0):
                chars[counter2]=sentence[i]
                counter2=counter2+1
            counter1=0
        
        if(counter2==26):
            return True
        else:
            return False
