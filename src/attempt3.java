import java.util.Scanner;
public class attempt3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		scan.nextLine();
		
		String[] allinputs = new String[rounds];
		
		for (int ugh = 0; ugh < rounds; ugh++) {
			allinputs[ugh] = scan.nextLine();
		}
		
		for (int u=0; u<rounds; u++) {
			char[] chars = new char[allinputs[u].length()+1];
			
			for (int i=0; i<allinputs[u].length(); i++) {
				chars[i] = allinputs[u].charAt(i);
			}
			
			int[] temps = new int[80];
			
			int i=0;
			
			while (chars[0]==chars[i] && i<allinputs[u].length()) {
				i++;
			}
			temps[0] = i;
			System.out.print(temps[0] + " " + chars[temps[0]-1] + " ");
			///////////////////////////////////////////////////////
			while (chars[temps[0]]==chars[i] && i<allinputs[u].length()) {
				i++;
			}
			temps[1] = i;
			System.out.print((temps[1]-temps[0]) + " " + chars[temps[1]-1] + " ");
			////////////////////////////////////////////////////
			for (int idk=0; idk<80; idk++)
			
			while (chars[temps[1]]==chars[i] && i<allinputs[u].length()) {
				i++;
			}
			temps[2] = i;
			System.out.print ((temps[2]-temps[1]) + " " + chars[temps[2]-1] + " ");
			/////////////////////////////////////////////////////
			while (chars[temps[1]]==chars[i] && i<allinputs[u].length()) {
				i++;
			}
			temps[3] = i;
			System.out.print ((temps[3]-temps[2]) + " " + chars[temps[3]-1] + " ");
			//////////////////////////////////////////////////////
			while (chars[temps[1]]==chars[i] && i<allinputs[u].length()) {
				i++;
			}
			temps[3] = i;
			System.out.print ((temps[3]-temps[2]) + " " + chars[temps[3]-1] + " ");
			//////////////////////////////////////////////////////
			
			System.out.println();
		}
		
		scan.close();
		

	}

}