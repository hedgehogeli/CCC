import java.util.Scanner;
import java.util.Stack;

public class HiddenPalindrome {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		System.out.println(recur(input, input.length(), 0));
		
	}
	
	public static int recur(String input, int length, int start) {
		if (isPal(input.substring(start,start+length))==true) return length;
		if (length<=1) return 1;
		
		if (start+length>=input.length()) return recur(input,length-1,0);
		else return recur(input,length,start+1);

	}
	
	public static boolean isPal(String input) {
		String temp="";
		Stack<String> st = new Stack<>();
		for (int i=0;i<input.length();i++) {
			st.push(input.substring(i,i+1));
		}
		while (st.empty()==false) {
			temp = temp + st.pop();
		}
		
		if (temp.equals(input)) return true;
		else return false;
	}
	

}
