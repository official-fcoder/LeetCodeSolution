package leetcodeeasy;

/***
 * @author vishal
 * @leetcode #13 Roman To Integer (easy)
 */

public class Roman2Integer_13 {
	 public int getPriority(char x) {
	        switch(x) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 2;
	            case 'X':
	                return 3;
	            case 'L':
	                return 4;
	            case 'C':
	                return 5;
	            case 'D':
	                return 6;
	            case 'M':
	                return 7;
	        }
	        return 0;
	    }
	    
	    public int getValue(char x) {
	        switch(x) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	        }
	        return 0;
	    }
	    
	    public int romanToInt(String s) {
	    	int i = 0,total = 0;
	    	for(i=0;i<s.length()-1;i++) {
	    		char first = s.charAt(i);
	    		char second  = s.charAt(i+1);
	    		if(getPriority(first) < getPriority(second)) {
	    			total += getValue(second) - getValue(first);
	    			i++;
	    		} else {
	    			total += getValue(first);
	    		}
	    	}
	    	if(i != s.length()) total += getValue(s.charAt(i));
	    	return total;
	    }
	    
	    public static void main(String[] args) {
	    	Roman2Integer_13 ri = new Roman2Integer_13();
			String x = "XVII";
			System.out.println(ri.romanToInt(x));
		}
}
