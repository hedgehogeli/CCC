import java.util.*;
import java.io.*;

/*
* COMMENTS:     n pick r
*/

public class NCR {

	public static void main(String[] args) {
		 
		char[] source = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] des = new char[4]; 
		System.out.println(source.length + " pick " + des.length);
		
		findCom(source, des, 0, 0);
	}

	
	// des = destination , sin = source index, d = destination index
	public static void findCom (char[] source, char[] des, int sin, int din) {
		if (des.length==din) {
			for (int i=0;i<din;i++) { System.out.print(des[i] + " "); }
			System.out.println();
			return;
		}
		if(sin<source.length) {
			des[din] = source[sin];
			findCom(source, des, sin+1, din+1);
			findCom (source, des, sin+1, din);
		}
		
	}
	
}



