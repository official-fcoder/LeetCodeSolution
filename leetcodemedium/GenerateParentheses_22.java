package leetcodemedium;
import java.util.*;
/***
 * @author vishal
 * @leetcode #22 Generate Parentheses (medium)
 */

/***
 * if openning bracket is less than we will add
 * open bracket and then we also convert it into
 * closing bracket if we can means if closing 
 * bracket is less than openning bracket 
 */

public class GenerateParentheses_22 {

	public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        backtrack(ls,"",n,0,0);
        return ls;
    }
	
	public void backtrack(List<String> ls,String curr,int n,int open,int close) {
		if(curr.length() == 2*n) {
			ls.add(curr);
			return;
		}
		if(open < n) {
			backtrack(ls,curr+"(",n,open+1,close);
		}if(close < open) {
			backtrack(ls,curr+")",n,open,close+1);
		}
	}
	
	public static void main(String[] args) {
		
	}

}
