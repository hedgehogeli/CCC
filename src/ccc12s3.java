import java.util.*;
import java.io.*;

/*
* COMMENTS:  https://dmoj.ca/problem/ccc12s3
* FINISHED YOU GENIUS
*/

public class ccc12s3 {

	public static void main(String[] args) throws Exception {
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(mReader.readLine()); 
		
		Map <Integer, Integer> mapValOcc = new HashMap<>();
		//   value to #occurences         MAPPING
		for (int i=0;i<n;i++) {
			int temp = Integer.parseInt(mReader.readLine());
			if (mapValOcc.containsKey(temp)==true) {
				int te = mapValOcc.get(temp);
				mapValOcc.put(temp, te+1);
				}
			if (mapValOcc.containsKey(temp)==false) {
				mapValOcc.put(temp, 1);
				}
		}
		mReader.close();
		
//		for (int i:mapValOcc.keySet()) {
//			System.out.println(i + "+" + mapValOcc.get(i));
//		}
		
		// MAPS THE OCCURERENCES TO A LIST OF VALUES
		Map<Integer, LinkedList<Integer>> OccVals = new HashMap<>();
		// occurrences   list of values
		for (int i:mapValOcc.keySet()) {
			int occ = mapValOcc.get(i);
			
			if (OccVals.containsKey(occ) == true) {
				OccVals.get(occ).add(i);
			}
			if (OccVals.containsKey(occ) == false) {
				LinkedList<Integer> temp = new LinkedList<>();
				OccVals.put(occ, temp);
				OccVals.get(occ).add(i);
			}
		}
		
		//ARRAY OF ALL OCCURENCES, LOADING MAP KEYSET INTO ARRAY
		int[] occArr = new int[OccVals.size()];
		int c = 0;
		for (int i:OccVals.keySet()) {
			occArr[c] = i;
			c+=1;
		}
		Arrays.sort(occArr);
	//	for (int i:occArr) {
	//		System.out.println(i);
	//	}
		
		
if (OccVals.keySet().size()==1) { //ONLY ONE OCCURRENCE #
		int a = (occArr[0]); // A = OCCURENCE #;
		
		int[] arr = new int[OccVals.get(a).size()]; 
//		System.out.println(OccVals.get(a).size());
		int x = 0;
		for (int i:OccVals.get(a)) {
			arr[x] = i;   x+=1;   }
		Arrays.sort(arr);
		
//		for (int k=0; k<arr.length; k++) {
//			System.out.print(arr[k]+" ");
//		}
		
		int out = abs(arr[arr.length-1] - arr[0]);
		System.out.println(out);
} //should be good?? YES

if (OccVals.keySet().size()>1) {
		
		int occM1 = occArr[occArr.length-1]; // MOST FREQUENT OCCURENCE #
		int occM2 = occArr[occArr.length-2]; // SECOND MOST FREQ OCCURENCE #
		
		if (OccVals.get(occM1).size() >=2 ) { // MORE THAN 2 OR 2 READINGS
			//find smallest and biggest BETWEEN VALUES
			int[] arr = new int[OccVals.get(occM1).size()];
			int x = 0;
			for (int i:OccVals.get(occM1)) {
				arr[x] = i;   x+=1;   }
			Arrays.sort(arr);
			
			int out = abs(arr[arr.length-1] - arr[0]);
			System.out.println(out);
			
		} //last case is here

		//THIS SECTION IS GOOD ====================================================
		if (OccVals.get(occM1).size() ==1 ) {
			// FIND SMALLEST VALUE OF SECOND MOST FREQ OCCURENCE #
			int maxFreq = OccVals.get(occM1).poll();
			
			int[] arr = new int[OccVals.get(occM2).size()]; // second array of second most occuring valus
			int x = 0;
			for (int i:OccVals.get(occM2)) {
				arr[x] = i;   x+=1;   }
			Arrays.sort(arr);
			
			int out = -1;
			for (int i=0; i<arr.length; i++) {
				int diff = abs(arr[i]-maxFreq);
				if (diff>out) out = diff;
			}
			System.out.println(out);
		}
		// ==========================================================================

		
//		System.out.println("====");
//		for (int i:OccVals.keySet()) {
//			System.out.println(i + " + " + OccVals.get(i));
//		}
		
	}
	
	
	}
	
	public static int abs(int input) {
		if (input<0) return input*-1;
		else return input;
	}
 
}



