import java.util.Scanner;
public class HappySad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text=scan.nextLine();
		scan.close();
		int happy=0; int sad=0;
		if (text.length()<=255 && text.length()>=1) {
		for (int i=0;i<text.length()-2;i++) {
			if (text.substring(i, i+3).equals(":-)")) {
				happy++;
			}
			if (text.substring(i, i+3).equals(":-(")) {
				sad++;
			}
		}
		if (happy>sad) {
			System.out.println("happy");
		}
		else if (happy<sad) {
			System.out.println("sad");
		}
		else if (happy==sad && sad>0) {
			System.out.println("unsure");
		}
		else if (happy==sad && happy == 0){
			System.out.println("none");
		}
		}
	}
}
