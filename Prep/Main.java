import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String input = mReader.readLine();
		
		Stack<Character> st = new Stack<>();
		st.push(input.charAt(0));
		for (int i=1; i<input.length(); i++) {
			if (!st.isEmpty()) {
			if(input.charAt(i)==st.peek()) {
				st.pop();
			}
			else {
				st.push(input.charAt(i));
			}
		}
			else st.push(input.charAt(i));
		}
		
		Stack<Character> temp =  new Stack<>();
		
		while (!st.isEmpty()) {
			temp.push(st.pop());
		}
		while (!temp.isEmpty()) {
			System.out.print(temp.pop());
		}
		
}
}
