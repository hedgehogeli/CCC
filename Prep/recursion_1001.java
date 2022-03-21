import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion_1001 {
	
	public static void main(String[] args) throws IOException {
	BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
	String input = mReader.readLine();

	String re = func(input);
	System.out.println(re);
	}

	public static String func(String s) {
		if (s.length() < 2) return s;
		String re = "";
		boolean flag = true;
		
		for (int i=0; i<s.length()-1; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i+1);
			
			if (ch1 == ch2) {
				re = func(s.substring(0, i)+s.substring(i+2));
				flag = false;
				break;
			}
			
			
		}
		
		if(flag) return s;
		return re;
		
	}
	
	// ===================================
	
	
	public static void oof(String s1, String s2) {
		
		if(s1.length()==0) {
			System.out.println(s2);
		}
		
	char ch = s2.charAt(0);
		
		if (ch != s1.charAt(s1.length())) {
			oof( (s1 + s2.substring(0, 1) ), (s2.substring(1)) );
			 
		}
		
		else {
			
			oof( (s1.substring(0, s1.length()-1)), s2.substring(1)) ;
			
			
		}
		
	}
	
}