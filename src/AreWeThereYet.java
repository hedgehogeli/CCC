import java.util.Scanner;

public class AreWeThereYet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
//		==============================
		String[] numbers = input.split(" ",0);
		
		int[] ints = new int[numbers.length]; 
		for (int i=0; i<ints.length; i++){
		    ints[i] = Integer.parseInt(numbers[i]); 
		}
		
	/*	for (int i=0; i<ints.length; i++) {
			for (int o=0; o<5; o++) {
				
			}
		System.out.println(ints[i]-ints[0]);
		}
		*/
		System.out.println("0" + " " +(ints[0])+ " " +(ints[0]+ints[1]) + " " +
				(ints[0]+ints[1]+ints[2]) + " " + (ints[0]+ints[3]+ints[2]+ints[1]));
		System.out.println((ints[0])+ " " + "0" + " " +(ints[1]) + " " +
				(ints[1]+ints[2]) + " " + (ints[3]+ints[2]+ints[1]));
		System.out.println((ints[0]+ints[1]) + " " +(ints[1]) + " " + "0" + " " +
				(ints[2]) + " " + (ints[2]+ints[3]));
		System.out.println((ints[0]+ints[1]+ints[2])+ " " +(ints[1]+ints[2]) + " " +
				(ints[2]) + " " + "0" + " " + (ints[3]));
		System.out.println((ints[0]+ints[3]+ints[2]+ints[1]) + " "  + (ints[3]+ints[1]+ints[2])
				+ " " + (ints[3]+ints[2]) + " " + (ints[3]) + " " + "0");
} 
}