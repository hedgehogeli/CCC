import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc2005j5 {

	public static void main(String[] args) throws IOException {
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		boolean isx = false;
		while (isx == false) {

			input = mReader.readLine();
			if (input.equals("X")) {
				isx = true; break;}
			
			if(monkeyWord(input) == true) {	System.out.println("YES");}
			else {System.out.println("NO");}
		}

	}
	
	static boolean temp1, temp2;
	static int indexB, indexN;
	
	public static boolean monkeyWord(String input) {
		if (input.equals("A")) { return true; }
		
		
		
		indexB = input.indexOf("B");
		indexN = input.indexOf("N");
		
		if (indexB < indexN && indexB>=0) {
			if (checkB(input) == false ) return false;
		//	checkN(input);
		}
		else {
			if (checkN(input) == false ) return false;
			
		//	checkB(input);
		}
		
		return true;
	}
	
	
	public static boolean checkB (String input ) {
		if (indexB>=0) {
			int indexS = -1;
			if (input.indexOf("B",indexB+1)==-1 || input.indexOf("B",indexB+1)>input.indexOf("S")) {
				indexS = input.indexOf("S");
			}
			if (input.indexOf("S")>input.indexOf("B",indexB+1) && input.indexOf("B",indexB+1) > 0) {
				boolean meh = monkeyWord(input.substring(input.indexOf("B",indexB+1), input.indexOf("S")));
				if (meh == true) return true;
				else return false;
			}
			
			if (indexS <= 0) return false;
			if (monkeyWord(input.substring( input.indexOf("B")+1 , indexS )) == false) {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean checkN (String input) {
		if (indexN>0) {
			temp1 = monkeyWord(input.substring(0,indexN));
			temp2 = monkeyWord(input.substring(indexN+1));
			if (temp1==true && temp2 == true) return true;
		}
		return false;
	}
	
	

}
