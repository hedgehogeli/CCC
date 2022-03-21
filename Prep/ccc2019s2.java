import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashMap;

public class ccc2019s2 {

//	static HashMap<Integer, Boolean> map = new HashMap<>(); 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(mReader.readLine());
		
		for (int i=0;i<T;i++) {
			int input = Integer.parseInt(mReader.readLine());
			
			int a=0;
			if (input%2==0) a=1;
			if (input%2==1) a=2;
			for (int k=a;k<input;k=k+2) {
				boolean small = checkPrime(input-k);
				boolean large = checkPrime(input+k);
				
				if (small==true&&large==true) {
					System.out.println((input-k) + " " + (input+k));
					break;
				}
			}
			
		}	
		

	}
	
	
	public static boolean checkPrime(int input) {
	//	if (map.containsKey(input)) {
	//		return map.get(input);
	//	}
		for (int i=3;i<=(Math.sqrt(input));i++) {
			if (input%i==0) {
	//			map.put(input, false);
				return false;
			}
		}
	//	map.put(input, true);
		return true;	
	}

	
	
}
