import java.util.*;
import java.lang.*;
class Vowel{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char c = sc.findInLine(".").charAt(0);
	    c = Character.toLowerCase(c);
	    String v = "aeiou";
	    if((c>='a')&&(c<='z')){
	        if(v.indexOf(c)!=-1){
	            System.out.println("Vowel");
	        }
	        else{
	            System.out.println("Consonant");
	        }
	    }
	}
}
