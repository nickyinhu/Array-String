package arraystring;

/**
 * Reverse a string
 * @author Hu
 *
 */
public class StringReverse {
	public static String reverseString (String s){
		int length = s.length();
		StringBuilder sb = new StringBuilder();
		for(int i = length-1;i>-1;i--){
			sb.append(s.charAt(i));
		}
		s = sb.toString();
		return s;
	}
	
	public static void main (String[] args){
		String s = "amsbdsabbbbb";
		s = StringReverse.reverseString(s);
		System.out.println(s);
	}
}
