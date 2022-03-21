import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;
import java.io.*;

public class pt1 {
	public static void main(String[] args) throws IOException {
		
		
		/*
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5); // al.add(new Integer(5)); //same thing
		al.add(3);
		al.add(2);
		
		for(int k : al ) {
			System.out.print(k + " ");
		}
		
		al.add(1,10);
		
		for(int k : al ) {
			System.out.print(k + " ");
		}
		
		if(al.contains(1)) {
			System.out.println("yes");
		}
		else System.out.println("no");
		*/
		
		// ==================================================================
		// ==================================================================
		
		/*
		Stack<String> st = new Stack<>();
		st.push("abc");
		st.push("tom");
		System.out.println(st.peek() );
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		} */
		
		//isEmpty is boolean - checks if it is empty
		//.peek looks at the first element without removing it
		// .pop takes the first element, also removes it
		// push adds an element on top. 
		
	//	Scanner scan = new Scanner(System.in);
	//	String input = scan.nextLine();
	//	scan.close();
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