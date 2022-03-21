import java.util.HashMap;
import java.util.Scanner;
	
public class ccc2017s3 {
	
	//"nailed it"
	//maximum height of fence is 4000, min is 2
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>(); //HEIGHTOFBOARD, #OFTHEHEIGHT
		// e.g. m.put(10,1000) means 1000 boards of height 10
		int n = scan.nextInt(); scan.nextLine();
		int maxvalue=0, secondmaxvalue=0;
		for (int i=0; i<n; i++) {
			int value = scan.nextInt();
			if(value<maxvalue) {
				maxvalue = value; 
				secondmaxvalue=maxvalue;
			}
			
			if (map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			}
			else map.put(value,1);
		}
		scan.close();
		
		int lengthCount = 0, heightCount = 0;
		for (int length=1; length<n/2; length++) {
			for (int height=2; height<(maxvalue+secondmaxvalue); height++) {
				
				
				//now find x1 + x2 = height
				
			}
		}
		
		
	/*	for (int len=1; len<=4000; len++) {
			
			for (int firstBoard = 2; firstBoard<=len/2; firstBoard++) {
				int numoffirstboard = m.get(firstBoard);
				int numberofsecondboard = m.get(len-firstBoard);
				// figure how many ways to make len
			}
			
			
		} */
		
			
		}
		
		//example!!!! 
		/*
		15
		1 2 3 10 4 20 42 3 4 4 3 3 4 1 2
		
		map --> 1,2   2,2   3,4   4,4   10,1   20,1   42,1
		
		for(int totalLen=2; toLen<=82 (maxlength*2); toLen++) {
			for(int len1=1; len1<=toLen/2; len1++) {
				//when toLen=2, len1 = 1
				1,2 and 1,2 --> height =2, 1 possible
				
				when tolen=3, flen=1
				1,2 and 2,2 --> h = 3; and 2 ways 
				
				
				
				
				
				
			}
		}
		
		*/
		
		
		
		
		
}
