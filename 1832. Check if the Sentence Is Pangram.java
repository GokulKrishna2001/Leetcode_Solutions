class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] chars=new char[26];
        int len=sentence.length();
        //System.out.println(len);
        //return true;
        int counter1=0;
        int counter2=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<26;j++)
            {
                if(sentence.charAt(i)==chars[j])
                    counter1=1;
            }
            if(counter1==0)
            {
                chars[counter2]=sentence.charAt(i);
                counter2++;
            }
            counter1=0;
        }
        if(counter2==26)
            return true;
        else
            return false;
    }
}
