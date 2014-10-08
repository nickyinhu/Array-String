package arraystring;


/**
 * Count continuous numbers for each character, and return as character count character count. e.g. aaabbbb -> a3b4
 * if result String is longer than original one, return original string instead
 * @author Hu
 *
 */
public class CountChar {
	static String countChar(String s){
		if(s == null || s.length()<2){
			return s;
		}
		char slow = s.charAt(0);
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 1;i<s.length();i++){			
			char c = s.charAt(i);
			if(c == slow){
				count ++;
			} else{
				sb.append("" + slow+count);
				if(sb.length()>=s.length()){
					return s;
				}
				slow = c;
				count = 1;
			}
		}
		sb.append("" +slow + count);
		if(sb.length() < s.length()){
			String result = sb.toString();
			return result;
		}
		return s;
	}
	
	public static void main(String[] args){
		String s = "aaaaaaaaabbbbbbbbbbccccccccc";
		System.out.println(CountChar.countChar(s));
	}
}
