import java.util.Scanner;
import java.util.Stack;

public class duowei1543 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int items = scan.nextInt();
		scan.nextLine();
		
		//int[] intArray = new int[items];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i=0;i<items;i++) {
			int x = scan.nextInt();
			
			if (contains4(x) == true) {
				if (x>=i+1) {
					stack.clear();
				}
				else {
				for (int u=0;u<x && !stack.isEmpty();u++) {
					stack.pop();
				}
				}
			}
			
			else {
				stack.add(x);
			}
			
			
			
		}
		
		for (int y=0;y<stack.size();y++)  {
			System.out.print(stack.pop() + " ");
		}
		
	}
	
	public static boolean contains4(int a) {
		if (String.valueOf(a).contains("4")) {
			return true;
		}
		else return false;
	}

}
