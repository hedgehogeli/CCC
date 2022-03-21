import java.util.Scanner;

public class ArrivalTime {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int hours = Integer.parseInt(input.substring(0,2)); 
		int mins = Integer.parseInt(input.substring(3,5));
		scan.close();
		
		int total = hours*60 + mins;
		int temp = 0;
		int travelTime=0;
		
		if (420<=total&&total<600) {
			travelTime = 120 - (600-total)/2  +  600-total;
			temp = total + travelTime;
			
			String tp1 = String.format("%02d%n", temp/60);
			String tp2 = String.format("%02d%n", temp%60);
			System.out.println(tp1.substring(0,2) + ":" + tp2.substring(0,2));
		}
		
		else if (300<total&&total<420) {
			travelTime = (120-(420-total))*2 + 420-total;
			temp = total + travelTime;
			
			String tp1 = String.format("%02d%n", temp/60);
			String tp2 = String.format("%02d%n", temp%60);
			System.out.println(tp1.substring(0,2) + ":" + tp2.substring(0,2));
		}
		
		else if (900<=total&&total<1140) { // 15-19
			
			travelTime = 120 - (1140-total)/2  +  1140-total;
			temp = total + travelTime;

			String tp1 = String.format("%02d%n", temp/60);
			String tp2 = String.format("%02d%n", temp%60);
			System.out.println(tp1.substring(0,2) + ":" + tp2.substring(0,2));
		}
		
		else if (780<total&&total<900) { // 13-15
			travelTime = (120-(900-total))*2 + 900-total;
			temp = total + travelTime;
			
			String tp1 = String.format("%02d%n", temp/60);
			String tp2 = String.format("%02d%n", temp%60);
			System.out.println(tp1.substring(0,2) + ":" + tp2.substring(0,2));
		}
		
		else {
			if (total>=1320) {total = total-1440;}
			temp = total + 120;
			String tp1 = String.format("%02d%n", temp/60);
			String tp2 = String.format("%02d%n", temp%60);
			System.out.println(tp1.substring(0,2) + ":" + tp2.substring(0,2));
		}
		
	}

}
