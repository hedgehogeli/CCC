import java.util.Scanner;
public class Punchy {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		int on = 1; //for the while loop
		int num = Integer.parseInt(input.substring(0,1));
		int a=0, b=0;
		String X, Y;
		
		while (on!=0) {
			switch(num) {
			case 1:
				X = input.substring(1,2);
				Y = input.substring(2,3);
				if (X.equals("A")) {
					a = Integer.parseInt(Y);
				}
				if (X.equals("B")) {
					b = Integer.parseInt(Y);
				}	
				break;
				
			case 2:
				X = input.substring(1,2);
				if (X.equals("A")) {
					System.out.println(a);
				}
				if (X.equals("B")) {
					System.out.println(b);
				}	
				break;
				
			case 3:
				X = input.substring(1,2);
				Y = input.substring(2,3); //X+Y and store in X
				if (X.equals("A")) {
					a = a+b;
				}
				if (X.equals("B")) {
					b = a+b;
				}	
				break;
				
			case 4:
				X = input.substring(1,2);
				Y = input.substring(2,3);
				if (X.equals("A")) {
					a = (a*b);
				}
				if (X.equals("B")) {
					b = (a*b);
				}	
				break;
				
			case 5:
				X = input.substring(1,2);
				Y = input.substring(2,3);
				if (X.equals("A")) {
					a = a-b;
				}
				if (X.equals("B")) {
					b = a-b;
				}	
				break;
				
			case 6:
				X = input.substring(1,2);
				Y = input.substring(2,3);
				if (X.equals("A")) {
					a = a-a%b;
				}
				if (X.equals("B")) {
					b = b-b%a;
				}	
				break;
				
			case 7: //DONE
				on = 0;
				break;
			}
			
		}
	}
}