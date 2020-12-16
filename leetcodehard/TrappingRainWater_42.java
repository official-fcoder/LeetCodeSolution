package leetcodehard;
/***
 * @author vishal
 * @leetcode #42 Trapping Rain Water (hard)
 */

/***
 * approach : water is bounded by left side and 
 * right side boundary so find left side max and 
 * right side max then find min from both and 
 * return level since if we found max in left
 * it is max until we didn't found an val that
 * is greater than that
 */

public class TrappingRainWater_42 {
	
	public int trap(int[] height) {
		int max = Integer.MIN_VALUE;
		int n= height.length;
		int left[] = new int[n];
		int right[] = new int[n];
		for(int i=0;i<n;i++) {
			max = Math.max(max,height[0]);
			left[i] = max;
		}
		max = Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--) {
			max = Math.max(max, height[i]);
			right[i] = max;
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			int level = Math.min(left[i],right[i]) - height[i];
			if(level > 0) ans += level;
		}
		return ans;
	}
	
}
