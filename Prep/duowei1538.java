import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class duowei1538 {
	
	public static void main(String[] args) throws IOException {
	BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
	String input1 = mReader.readLine();
	String input2 = mReader.readLine();
	
	Stack<Integer> st = new Stack<>();
	
	String input21 = "";
	for (int i=0;i<input2.length();i++) {
		if (input2.charAt(i)!=' ') {
			input21 = input21 + input2.substring(i, i+1);
		}
	}
	
	System.out.println(input21);
	
	for (int i=0; i<input21.length();i++) {
		st.push(Integer.parseInt(input21.substring(i, i+1)));
	}
	
	for (int i=0;i<5;i++) {
	System.out.print(st.pop());
	}
		
		
		
		
	}
	
}