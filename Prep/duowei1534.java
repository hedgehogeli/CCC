import java.util.Scanner;

public class duowei1534 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String lol = (recurse(input));
		
		
	}
	
	public static String recurse(String input) {
		if (input.indexOf('?')<0) {
			System.out.println(input);
			return input;
		}
		
		int hm = input.indexOf('?');
		
		return recurse(input.substring(0,hm) + "0" + input.substring(hm+1)) + 
				recurse(input.substring(0,hm) + "1" + input.substring(hm+1));
		
		
	}

}
