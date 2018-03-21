
public class Sprials {

	private static String[][] grid;
	
//	public static void main(String[] args) {
//		spiralYo(5);
//	}
	

	
	
	
	public static void spiralYo(int size) {
		grid = new String[size][size];
		
		
		for(int i = 0; i < size; i++) {
			grid[i][0] = Integer.toString(i+1);
		}
			
//			for(int j = 0; j < size; j++) {
//
//			}
		printGrid(size);
	}
	
	public static void printGrid(int size) {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				System.out.print(grid[j][i] + " ");
			}
			System.out.println();
		}
	}

}
	
	//0,0   1,0   2,0   3,0   3,1   3,2   3,3   2,3   1,3   0,3   0,2   0,1   1,1   2,1   2,2   1,2    
	
	
	//2 has 4 cells
	//1 number between the 2 and 4 (2nd) 
	//1 2
	//4 3
	//1 2, 4 3
	
	//3 has 9 cells
	//4 numbers from 3 to the 8 (5th) = the (length - 1) * 2
	//1 2 3
	//8 9 4
	//7 6 5
	//1 2 3, 8 9 4, 7 6 5
	
	//4 has 16 cells
	//7 numbers between the 4 and the 12 (8th)
	//1  2  3  4
	//12 13 14 5
	//11 16 15 6
	//10 9  8  7
	//1 2 3 4, 12 13 14 5, 11 16 15 6 
	
	//5 has 25 cells
	//
	//1  2  3  4  5
	//16 17 18 19 6
	//15 24 25 20 7
	//14 23 22 21 8
	//13 12 11 10 9
	//for the first line = size, then for the next 3 its (size -1), then for the next 2 its (size - 2) 
	//1 2 3 4 5, 16 17 18 19 6, 15 24 25 20 7, 14 23 22 21 8, 13 12 11 10 9

