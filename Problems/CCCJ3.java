import java.util.Scanner;

public class CCCJ3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.nextLine();
		
		for (int k=0;k<n;k++) {
			
			String input = scan.nextLine();
			input = input + " ";
			
			int counter = 1;
		
			for (int i=0;i<input.length()-1;i++) {
				if (input.charAt(i) == input.charAt(i+1)) {
					counter ++;
				}
				else {
					System.out.print(counter + " " + input.substring(i,i+1) + " ");
					counter = 1;
				}
			}
			System.out.println();
		
		}
	
		/*
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		scan.nextLine();
		
		// variables
		int counter=0;
		String charc = "";
		
		// TAKING IN INPUTS
		String[] inputs = new String[rounds];
		for (int i=0; i<rounds; i++) {
			inputs[i] = scan.nextLine();
		}
		scan.close();
		
		// PROCESSING EACH INPUT
		for (int i=0; i<rounds; i++) {
			counter=0;
			
			if (inputs[i].length()>1) { //LENGTH HAS TO BE BIGGER THAN 1
				
				//GOING THROUGH EACH LETTER
				for (int o=0; o<inputs[i].length()-1; o++) {
					charc = inputs[i].substring(o+1, o+2);
					counter ++;
					if (inputs[i].charAt(o)!=inputs[i].charAt(o+1)) {
						System.out.print((counter) + " " + inputs[i].charAt(o) + " ");
						counter = 0;
					}
				}
				System.out.println((counter+1) + " " + charc);
				
			}
			else if (inputs[i].length() == 1) {
				System.out.println("1 " + inputs[i].charAt(0));
			}
			
			
		}*/
	}
	
	
}