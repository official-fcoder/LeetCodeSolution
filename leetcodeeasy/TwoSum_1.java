package leetcodeeasy;
import java.util.*;
/***
 * @author Vikas
 * @leetcode #1 Two Sum (easy) 
 */
/***
 * 
 * One pass HashMap Solution 
 * check for complement if it is not present 
 * then insert complement in HashMap 
 */
public class TwoSum_1 {
	
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int n = nums.length;
		for(int i=0;i<n;i++) {
			int comp = target - nums[i];
			if(map.containsKey(nums[i])) {
				return new int[] {map.get(nums[i]),i};
			}
			map.put(comp,i);
		}
		throw new IllegalArgumentException ("No Two Sum Solution Exists");
	}
	
	public static void main(String[] args) {
		TwoSum_1 ts = new TwoSum_1();
		int nums[] = new int[]{23,12,54,6,32,66,2,1,4,5};
		try {
			int result[] = ts.twoSum(nums, 10);
			System.out.println(result[0] + " " + result[1]);
			System.exit(1); // It will not run finally block
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Thank you");
		}
		
	}
	
}
