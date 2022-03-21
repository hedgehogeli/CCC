import java.util.HashMap;
import java.util.Scanner;

public class ccchk2008j3phonebook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums = scan.nextInt(); scan.nextLine();
		
		HashMap<String, Integer> map = new HashMap<>();  
		
		String input = ""; 
		
		for (int i=0;i<0;i++) {
			input = scan.nextLine();
			map.put(input.substring(0,input.indexOf(' ')), 
					Integer.parseInt(input.substring(input.indexOf(' ')+1)));
	//		count.put(input.substring(0,input.indexOf(' ')), 0);
		}
		
		//=============
		int dials = scan.nextInt(); scan.nextLine();
		
		HashMap<Integer, Integer> count = new HashMap<>();
		
		for (int i=0;i<dials;i++) {
			int number = scan.nextInt();
			
			count.put(number, count.get(number)+1);
		}
		
		for (int i=dials;i>dials;i--) {
			if ( count.containsValue(i) ) {
				int max = i;
				break;
			}
		}
		
		
		
		for (int i=dials;i>dials;i--) {
		
		}
		
		
		
	}

}
