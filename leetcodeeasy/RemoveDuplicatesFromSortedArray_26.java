package leetcodeeasy;
/***
 * @author vishal
 * @leetcode #26 Remove duplicates from Sorted Array (easy)
 */
/***
 * Use Two pointers if they are not same then increase i 
 * and insert that value and increase j for skipping 
 * duplicate elements
 */
public class RemoveDuplicatesFromSortedArray_26 {
	
	public static int removeDuplicates(int[] nums) {
		int i=0;
		int n = nums.length;
		for(int j=1;j<n;j++) {
			if(nums[i] != nums[j]) {
				nums[++i] = nums[j];
			}
		}
		return i+1;
	}
	
	public static void main(String[] args) {
		int nums[] = new int[] {1,1,2,3,5,6,6,7,7,7,7,7,9};
		int n = removeDuplicates(nums);
		for(int i=0;i<n;i++) System.out.print(nums[i] + " ");
	}
}
