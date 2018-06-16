import java.util.*;
class NumPalindrome{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    StringBuffer sb = new StringBuffer(s);
	    sb = sb.reverse();
	    String c = sb.toString();
	    if(s.equals(c)){
	        System.out.println("yes");
	    }
	    else{
		System.out.println("no");
	    }
	}
}
