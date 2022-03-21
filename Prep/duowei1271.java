import java.util.HashMap;
import java.util.Scanner;

public class duowei1271 {

	// ax^3 + by^3 + ... = 0
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt(),e=scan.nextInt();
		scan.close();
		
		int counter=0;
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		for(int x4=-50;x4<50;x4++) {
			if (x4==0) continue;
			for (int x5=-50;x5<50;x5++) {
				if (x5==0) continue;
				
				int temp = (x4*d*d*d + x5*e*e*e);
				if(map.containsKey(temp)) {
					map.put(temp, map.get(temp)+1);
				}
				else {
				map.put(temp, 1);}
				
			}
		}
			
		for (int x1=-50; x1<50; x1++) {
			if (x1==0) continue;
			for (int x2=-50; x2<50; x2++) {
				if(x2==0) continue;
				for (int x3=-50; x3<50; x3++) {
					if (x3==0) continue;
					
							int temp2 = a*x1*x1*x1 + b*x2*x2*x2 + c*x3*x3*x3;
							if (map.containsKey(temp2) == true) {
								counter=counter+map.get(temp2);
							}

				}
			}
		}
		
		System.out.println(counter); 
		
		// no idea why it doesnt work but screw it
		
	}

}
