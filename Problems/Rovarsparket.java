import java.util.Scanner;

public class Rovarsparket {
	public static void main(String[] args) {		
		String consonants = "bcdfghjklmnpqrstvwxyzz"; //double z intended
		String vowels = "aeiou";
		// aBCDeFGHiJKLMNoPQRSTuVWXYZ
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		for (int o=0; o<input.length(); o++) { //going thru input
			for (int i=0; i<21; i++) { //going thru consonants
				 if (consonants.charAt(i) == input.charAt(o)) { //if i is at a consonant
					 System.out.print(consonants.charAt(i)); // printing the consonant
					 // ADDING VOWELS
					 if (i<=1) {
						 System.out.print("a");
					 } 
					 else if (i<=4){
						 System.out.print("e");
					 }
					 else if (i<=8){
						 System.out.print("i");
					 }
					 else if (i<=13){
						 System.out.print("o");
					 }
					 else if (i<=21){
						 System.out.print("u");
					 }
					 System.out.print(consonants.charAt(i+1));
				 }
			} //consonant forloop
			
			for (int i=0; i<5; i++) {
				if (vowels.charAt(i) == input.charAt(o)) {
					System.out.print(input.charAt(o));
				}
			} //vowel forloop
		} //major for
	}
}
