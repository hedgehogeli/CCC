import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tryHashMap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		Map<Character, Integer> map = new HashMap<>(); 
		int[] num = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		for (int i=0;i<26;i++) {
			map.put( (char)('A'+i), num[i]);
		}
		
		for (int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if (ch>='A'&& ch<='Z') {
				System.out.print(map.get(ch));
			}
			else System.out.print(ch);
		}
		
		

		
	}

}

