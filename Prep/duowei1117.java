import java.util.Scanner;

public class duowei1117 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.close();
		
		String output = recurse2(n);
		
		while (output.indexOf("2(1)")>=0) {
				int ree = output.indexOf("2(1)");
				output = output.substring(0,ree) + "2" + output.substring(ree+4);
		}
		
		System.out.println(output);
	}
	
	public static String recurse2 (int input) {
		if (input == 0) return "";
//		if (input == 2) return "2";
		
		int temp = input; int temp2 = 1; int count = 0;

		while(temp>1) {
			temp = temp/2;
			count++;
		}
		
		for (int i=0;i<count;i++) {
			temp2 = temp2*2;
		}
		int remain = input%temp2;
		
		if (remain==0)	
			if (count>2) return 2 + "(" + recurse2(count) + ")";
			else return 2 + "(" + count + ")";
		
		else 
			if (count>2) return "2" + "(" + recurse2(count) + ")" + "+" + recurse2(remain);
			else return "2" + "(" + count + ")" + "+" + recurse2(remain);
		
	}

}
