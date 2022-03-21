import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CCCJ5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine(); 
		String line2 = scan.nextLine();
		String line3 = scan.nextLine();
		String line4 = scan.nextLine();
		scan.close();		
		int input1 = Integer.parseInt(line1.substring(0, line1.indexOf(" ")));
		int output1 = Integer.parseInt(line1.substring(line1.indexOf(" ")+1));
		int input2 = Integer.parseInt(line2.substring(0, line2.indexOf(" "))); 
		int output2 = Integer.parseInt(line2.substring(line2.indexOf(" ")+1));
		int input3 = Integer.parseInt(line3.substring(0, line3.indexOf(" ")));
		int output3 = Integer.parseInt(line3.substring(line3.indexOf(" ")+1)); 
		int moves = Integer.parseInt(line4.substring(0,line4.indexOf(" ")));
		int start = Integer.parseInt(line4.substring( line4.indexOf(" ")+1, line4.indexOf(" ", line4.indexOf(" ")+1)));
		int end = Integer.parseInt(line4.substring(line4.indexOf(" ", line4.indexOf(" ")+1)+1));
		// input collection^^^
		
		Queue<Integer> q = new LinkedList<>(); 
		q.add(start);
		while (!q.isEmpty()) {
			S
			
		}
		
		
		
	}
	
	static String temp = "";
	public static int toBin(String input) {
		temp = "";
		for (int i=0;i<input.length();i++) {
			if(input.charAt(i)=='A') {temp += "1";}
			if(input.charAt(i)=='B') {temp += "0";}
		}
		return Integer.parseInt(temp);
	}
	
	static String temp2 = "";
	public static String toAB(int input) {
		temp = "";
		temp2 = Integer.toString(input);
		for (int i=0;i<temp2.length();i++) {
			if(temp2.charAt(i)=='1') {temp += "A";}
			if(temp2.charAt(i)=='0') {temp += "B";}
		}
		return temp;
	}
	

}
