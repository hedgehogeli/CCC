import java.util.*;


public class pt2 {
/*
	//RECURSION 7
	public int func(String s1, String s2) {
		//TODO base case
		if(s1.length()==0) {
			System.out.println(s2); 
			return;
		}
		
		char ch = s1.charAt(0);
		
		if(ch != '?') {
			func(s1.substring(1), s2+ch);
			return;
		}
		else {
			func(s1.substring(1), s2+"0");
			func(s1.substring(1), s2+"1");
		}
		return;
		
		
	}
	
	*/
	
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	scan.close();
	input = "101?1";

//	System.out.println(question(input));
	}
	
	
	
	public char question(int atChar) {
		String input = "101?1";
		if ((input.charAt(atChar)) != '?') {
			System.out.print(input.charAt(atChar));
		}
		if ((input.charAt(atChar)) == '?') {
			
		}
		
		return 'a';
	}
	

}
