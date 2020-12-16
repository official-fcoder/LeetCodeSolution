package leetcodehard;
import java.util.*;
/***
 * @author vishal
 * @leetcode #239 Sliding Window Problem (hard) 
 */
/***
 * @author vishal
 * Using deque and sliding window technique
 */
public class SlidingWindowMaximum_239 {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int ans[] = new int[n-k+1];
		Deque<Integer> deque = new LinkedList<>();
		for(int i=0;i<k;i++) {
			while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		ans[0] = nums[deque.peekFirst()];
		int start=0,end=k;
		while(end < n) {
			if(!deque.isEmpty() && deque.peekFirst() == start) {
				deque.removeFirst();
			}
			while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[end]) {
				deque.removeLast();
			}
			deque.addLast(end);
			ans[end-k+1] = nums[deque.peekFirst()];
			start++;
			end++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {1,3,-1,4,5};
		int n = nums.length;
		int k = 1;
		int ans[] = maxSlidingWindow(nums,k);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
