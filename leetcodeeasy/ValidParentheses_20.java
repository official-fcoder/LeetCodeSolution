package leetcodeeasy;
/***
 * @author vishal
 * @leetcode #20 Valid Parentheses (easy)
 */

/***
 * Use Stack for every open bracket push it in 
 * the stack else pop from stack and check if it 
 * is not similar to corresponding bracket 
 * then return false else keep processing and 
 * finally if stack is empty then return true else 
 * return false
 */

/***
 * You can use hashmap for corresponding brackets
 * if there was only one type opf brackets then this
 * problem can be done without using stack 
 * for every element you just have to keep
 * track of prev openning brackets if closing 
 * brackets are more than openning brackets then 
 * return false else at the end return true 
 */
public class ValidParentheses_20 {

}
