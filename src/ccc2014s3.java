import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/ccc14s3
* 
*DONE
*/

public class ccc2014s3 {

	static Stack<Integer> stackTop = new Stack<>();
	static Stack<Integer> stackSide = new Stack<>();
	static Stack<Integer> stackBottom = new Stack<>();
	static Queue<Integer> qu = new LinkedList<>(); 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int j=0; j<t; j++) {
			
			int n = scan.nextInt();
			stackTop = new Stack<>(); stackSide = new Stack<>(); stackBottom = new Stack<>(); 
			for (int k=0; k<n; k++) {    // LOADING TOPSTACK
			stackTop.push(scan.nextInt());
			} 
			
			stackBottom.push(0);
			//while top stack isn't empty : do all the moving
			while (stackTop.isEmpty()!=true) {
				//if top can enter bottom
				if (stackTop.peek()==stackBottom.peek()+1) {
					stackBottom.push(stackTop.pop());
				}
				else {
				// if side can enter bottom
					if (stackSide.isEmpty()==false && stackSide.peek()==stackBottom.peek()+1) {
					stackBottom.push(stackSide.pop());
					}

				// otherwise top enters side
					else {
						stackSide.push(stackTop.pop());
					}		
				}
				
	//			printAll();
			} //end of main while
			
			while (stackSide.isEmpty()==false && stackSide.peek()==stackBottom.peek()+1) {
				stackBottom.push(stackSide.pop());
			}
			
			
	//		printAll();
			//if side stack is empty then we good   && stackBottom.size()==n+1
			if (stackSide.isEmpty()==true ) {
				System.out.println("Y");
			}
			else System.out.println("N");

		} // end of master for loop
		

	}
	
	public static void printAll() {
		System.out.println("top:");
		System.out.println(stackTop);
		System.out.println("side:");
		System.out.println(stackSide);
		System.out.println("bottom");
		System.out.println(stackBottom);
		System.out.println();
	}
	
}