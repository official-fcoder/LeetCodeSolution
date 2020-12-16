package leetcodemedium;

/***
 * @author vishal
 * @leetcode #3 Longest Substring Without Repeating Characters (medium)
 */
/***
 * One Solution is to check All indices Pair they are unique or not using set
 * Other Solution is to use sliding window problem 
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
	
	public int lengthOfLongestSubstring(String s) {
		int n = s.length(),ans = 0;
        int index[] = new int[128];
        for(int i=0,j=0;j<n;j++) {
            i = Math.max(i,index[s.charAt(j)]);
            ans = Math.max(ans,j-i+1);
            index[s.charAt(j)] = j+1;
        }
        return ans;
        // a b c d e a f b d g c b b
	}
	
}
