import java.io.*;
import java.util.*;

public class ccc2018s3 {
	
	// CCC '18 S3 - RoboThieves
	
	static int[][] floor;
	static int rows, col;
	static HashMap<Integer, Integer> map = new HashMap<>(); 
	
	public static void main(String[] args) throws IOException {
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = mReader.readLine();
		rows = Integer.parseInt(line1.substring(0, line1.indexOf(' ')));
		col = Integer.parseInt(line1.substring(line1.indexOf(' ')+1));
		floor = new int[rows][col];
		
		String t = "", temp = ""; int hold=0;
		for (int i=0;i<rows;i++) {
			t = mReader.readLine();
			for (int k=0;k<col;k++) {
				temp = t.substring(k,k+1);
				if(temp.equals("W")) floor[i][k] = 1; // WALL
				if(temp.equals(".")) floor[i][k] = 0; //EMPTY
				// LET 2 = VISITED
				if(temp.equals("C")) floor[i][k] = 3; // CAMERA
				if(temp.equals("S")) {floor[i][k] = 4; //START
					hold = i*10+k;}
				if(temp.equals("L")) floor[i][k] = 6; // CONVEYER LEFT
				if(temp.equals("R")) floor[i][k] = 7; // CONVEYER RIGHT
				if(temp.equals("U")) floor[i][k] = 8; // CONVEYER UP
				if(temp.equals("D")) floor[i][k] = 9; // CONVEYER DOWN
			}
		} mReader.close();	
		for (int i=0;i<rows;i++) {
			for (int k=0;k<col;k++) {
				if (floor[i][k]==0) map.put(i*10+k, -1);
			}
	 	}
//System.out.println("before cam process");print();
	
	 	processCams(); // REMOVES CAMERAS, AND BAD SQUARES BY TURNING THEM INTO WALLS
//System.out.println(" after cam process"); print();
	 	
	 	spread(hold/10,hold%10,0);
//System.out.println("after spread"); print();
	 	
	 	for (int i=0;i<rows;i++) {
			for (int k=0;k<col;k++) {
				if(map.containsKey(i*10+k)) {
					System.out.println(map.get(i*10+k));
				}
			}
	 	}
		
	}
	
	
	public static void print() {
		for (int i=0;i<rows;i++) {
			for (int k=0;k<col;k++) {
				System.out.print(floor[i][k]);
			}
			System.out.println();
	 	}		
		System.out.println(); System.out.println("=============");
	}
	
	
	public static void spread(int row, int col, int steps) {
		if (floor[row][col]==4) {
			floor[row][col]=2;
			spread(row+1,col,steps+1);
			spread(row,col+1,steps+1);
			spread(row-1,col,steps+1);
			spread(row,col-1,steps+1);
		}
		//PROBLEM IS THAT THE FIRST SPREAD ALREADY MARKS OUT EVERYTHING, I NEED TO STOP MARKING SHIT AS 2
	//BUT IF I STOP MARKING SHIT AT 2 ISNT IT GOING TO OVERLOAD
		//YUP IT OVERLOADS
		if (floor[row][col]==0) { //if empty mark out in map then mark as 2 (visited)
			int mapGet = map.get(row*10+col);
			if (mapGet<0 || mapGet==-1) {
				map.put(row*10+col, steps);
		//		floor[row][col]=2; 
				spread(row+1,col,steps+1);
				spread(row,col+1,steps+1);
				spread(row-1,col,steps+1);
				spread(row,col-1,steps+1);
			}
			else if (mapGet>steps) {
				map.put(row*10+col, steps);
		//		floor[row][col]=2; 
				spread(row+1,col,steps+1);
				spread(row,col+1,steps+1);
				spread(row-1,col,steps+1);
				spread(row,col-1,steps+1);
			}
				

		}
		
		//CONVEYORS
		if (floor[row][col]==6) { //LEFT
			spread(row,col-1,steps);}
		if (floor[row][col]==7) { //RIGHT
			spread(row,col+1,steps);}
		if (floor[row][col]==8) { //UP
			spread(row-1,col,steps);}
		if (floor[row][col]==9) { //DOWN
			spread(row+1,col,steps);}

	}
	
	
	public static void processCams () {
		for (int i=0;i<rows;i++) {
			for (int k=0;k<col;k++) {
				if (floor[i][k]==3) { // if is camera
					floor[i][k] = 1;//turn cam into wall
					goRight(i,k); goDown(i,k); goUp(i,k); goLeft(i,k);
	}}}}	
	public static void goRight(int row, int col) {
		if (floor[row+1][col] == 0) {floor[row+1][col] = 1; goRight(row+1,col);}
		if (floor[row+1][col] >= 6) {goRight(row+1,col);}}
	public static void goDown(int row, int col) { 
		if (floor[row][col-1] == 0) {floor[row][col-1] = 1; goDown(row,col-1);}
		if (floor[row][col-1] >= 6) {goDown(row,col-1);}}
	public static void goLeft(int row, int col) { 
		if (floor[row-1][col] == 0) {floor[row-1][col] = 1; goLeft(row-1,col);}
		if (floor[row-1][col] >= 6) {goLeft(row-1,col);}}
	public static void goUp(int row, int col) { 
		if (floor[row][col+1] == 0) {floor[row][col+1] = 1; goUp(row,col+1);}
		if (floor[row][col+1] >= 6) {goUp(row,col+1);}}
}