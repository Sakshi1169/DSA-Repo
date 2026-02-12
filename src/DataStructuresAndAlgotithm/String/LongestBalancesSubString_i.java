package DataStructuresAndAlgotithm.String;
//leetcode-3713

/* approch
Start from every index of the string.
Expand the substring one character at a time.
Maintain:
A frequency array to count character occurrences.
A variable to count distinct characters.
For each substring:
Check if length % distinct == 0.
If yes, verify that all characters have equal frequency.
If the substring is balanced, update the maximum length.
Return the maximum length found.
 */
//time complexity-O(n)^2  space complexity-O(1)

public class LongestBalancesSubString_i {
    public int longestBalanced(String s) {
        int n=s.length();
        int maxLen=0;

        for(int i=0;i<n;i++)
        {
            int freq[]=new int[26];
            int distinct=0;

            for(int j=i;j<n;j++)
            {
                int index=s.charAt(j)-'a';

                if(freq[index]==0)
                {
                    distinct++;
                }

                freq[index]++;

                int len=j-i+1;
                if(len%distinct==0)
                {
                    int expected=len/distinct;
                    boolean isBalanced=true;


                    for(int k=0;k<25;k++)
                    {
                        if(freq[k]>0 && freq[k]!=expected)
                        {
                            isBalanced=false;
                            break;
                        }
                    }

                    if(isBalanced)
                    {
                        maxLen=Math.max(maxLen,len);
                    }
                }
            }
        }

        return maxLen;
    }
}
