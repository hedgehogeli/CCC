import java.util.Scanner;

/*
* Author : rayqu
* Date : Dec 11, 2018
*/
// TODO: rename to Main when submitting. 
public class Exercise1 { //should change to "Main"
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp1 = scan.nextInt();
		int temp2 = scan.nextInt();
		int temp3 = scan.nextInt();
		if (temp1==temp2 && temp3==temp2 && temp3==60) {
			System.out.println("Equilateral");
		}
		else {
			if (temp1+temp2+temp3==180 && (temp1==temp2 
					|| temp2==temp3 || temp1 == temp3)) {
				System.out.println("Isosceles");
			}
			else {
				if (temp1+temp2+temp3==180) {
					System.out.println("Scalene");
				}
				else {
					System.out.println("Error");
				}
			}
		}
		scan.close();
	}
}
