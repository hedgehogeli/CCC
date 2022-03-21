import java.util.Scanner;
public class UpAndDown {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); 
		int b = scan.nextInt(); 
		int c = scan.nextInt(); 
		int d = scan.nextInt(); 
		int steps = scan.nextInt();
		scan.close();
		int advN = a-b; int advB = c-d;
		int Nikky = 0, Bryon = 0;
		int remStepsN = steps%(a+b); int remStepsB = steps%(c+d);
		if (remStepsN==0) {
		Nikky = advN*(steps/(a+b));
		}
		else if (remStepsN > 0) {
			if (remStepsN<=a && remStepsN>0) {
				Nikky = advN*((steps-remStepsN)/(a+b)) + remStepsN;
				}
			else if (remStepsN<=(a+b) && remStepsN>a) {
				Nikky = advN*(steps-remStepsN)/(a+b) + a - (remStepsN-a);}
		}
		if (remStepsB == 0) {
		Bryon = advB*(steps/(c+d));
		}
		else if (remStepsB > 0) {
			if (remStepsB<=c) {
				Bryon = advB*(steps-remStepsB)/(c+d) + remStepsB;}
			else if (remStepsB<=(c+d)) {
				Bryon = advB*(steps-remStepsB)/(c+d) + c - (remStepsB-c);}
		}
		if (Nikky>Bryon) 
			System.out.println("Nikky");
		if (Nikky<Bryon)
			System.out.println("Byron");
		if (Bryon==Nikky)
			System.out.println("Tied");
	}
}