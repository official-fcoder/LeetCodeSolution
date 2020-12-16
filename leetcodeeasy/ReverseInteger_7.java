package leetcodeeasy;

/***
 * @author vishal
 * @leetcode #7 Reverse Integer (medium)
 */

public class ReverseInteger_7 {
	
	// If it overflow then return 0
	public int reverse(int x) {
		 int minus = (x < 0) ? -1  : 1;
		 String data = String.valueOf(minus * x);
		 String rev = new StringBuilder(data).reverse().toString();
		 try {
			 int ans = minus*Integer.parseInt(rev);
			 return ans;
		 } catch(NumberFormatException e) {
			 return 0;
		 }
	 }
	
	public static void main(String[] args) {
		ReverseInteger_7 ri = new ReverseInteger_7();
		
		System.out.println(ri.reverse(-321));
		System.out.println(ri.reverse(1111111199));
	}
}
