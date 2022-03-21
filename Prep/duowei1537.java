import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class duowei1537 {
	
	//given a string sequence with () [] {} and <> write program and check if brackets match 
	
	public static void main(String[] args) throws IOException {
	BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
	String input = mReader.readLine();
	
	//String str = "({})<>";
	
	Stack<Character> chars = new Stack<>();
	for (int i=0;i<input.length();i++) {
		char ch = input.charAt(i);
		
		if(ch=='{' || ch=='[' || ch=='<') {
			chars.push(ch);
		}
		else {
			if (chars.isEmpty()) {System.out.println("NO"); break;}
			
			char ch2 = chars.pop();
			if(!(ch=='}'&&ch=='{' || ch==']'&&ch=='[' || ch=='>'&&ch=='<')) {
				System.out.println("NO"); break;
			}
		}
		
	}
	
	if(chars.isEmpty()) {System.out.println("YES");}
	else {System.out.println("NO");}
	
	}
	
}