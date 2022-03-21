import java.util.Scanner;

public class attempt4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		scan.nextLine();
		
		String[] inputs = new String[rounds];
		for (int i=0; i<rounds; i++) {
			inputs[i] = scan.nextLine();
		}
		scan.close();
		
		//declaration of variables for below
		int counter=0;
		
		
		for (int i=0; i<rounds; i++) { //input lines
			for (int u=0; u<inputs[i].length()-1;u++) { //characters of input
				if (inputs[i].charAt(u)!=inputs[i].charAt(u+1)) { //TODO i think!!!
					counter++; //finding how many changes there are
				}
			}
			//System.out.println("counter" + counter);
			String[] spots = new String[counter];
			for (int p=0; p<inputs[i].length()-1; p++) {
				for (int y=0; y<counter; y++) {
					if (inputs[i].charAt(p)!=inputs[i].charAt(p+1)) { //TODO i think!!!
						spots[y] = inputs[i].substring(p+1);
					//	System.out.println(spots[y]);
					}
				}
				
			}
			System.out.println(spots[0]);
			System.out.println(spots[1]);
		//	int[] places = new int[counter];
	/*		String[] breakdown = new String[counter+1];
			
			for (int o=0; o<=counter; o++) {
				breakdown[o] = inputs[i].substring(1,3); //TODO
			}
			
			for (int u=0; u<inputs[i].length();u++) { //characters of input
				
				}
			}
			//output:
			System.out.println();
			8*/
		//}

	}}}


