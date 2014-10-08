package arraystring;

/**
 * Find out if a string has no repeat letter
 * @author Hu
 *
 */
public class UniqueChar {
	static boolean isUnique (String s){
		if(s.length() <2 ){
			return true;
		}
		boolean [] charSet = new boolean [256];
		for(int i = 0; i<s.length();i++){
			int val = s.charAt(i);
			if(charSet[val]){
				return false;
			} else {
				charSet[val] = true;
			}
		}
		return true;
	}	
	public static void main(String args[]){
		String s = "ascvbha";
		System.out.println(UniqueChar.isUnique(s));
	}
}
