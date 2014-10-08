package arraystring;

import java.util.*;
/**
 * Find out if a string is a permutation of another string
 * @author Hu
 *
 */
public class StringPermu {
	static boolean isPerm (String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		String[] aSet = a.split("");
		Arrays.sort(aSet);
		String[] bSet = b.split("");
		Arrays.sort(bSet);
		if(Arrays.equals(aSet,bSet)){
			return true;
		} 
		return false;
	}
	
	public static void main(String[] args){
		String a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac";
		String b = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		
		System.out.println(StringPermu.isPerm(a, b));
	}
}
