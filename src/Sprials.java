
public class Sprials {

	private static int[][] grid;
	
	public static void main(String[] args) {
		spiralYo(5);
	}
	
	public static void spiralYo(int size) {
		grid = new int[size][size];
		
		
		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < size; j++) {
//
//			}
		}
	}
	//0,0   1,0   2,0   3,0   3,1   3,2   3,3   2,3   1,3   0,3   0,2   0,1   1,1   2,1   2,2   1,2    
	
	
	//2
	//1 2
	//4 3
	//1 2, 4 3
	
	//3
	//1 2 3
	//8 9 4
	//7 6 5
	//1 2 3, 8 9 4, 7 6 5
	
	//4
	//1  2  3  4
	//12 13 14 5
	//11 16 15 6
	//10 9  8  7
	//1 2 3 4, 12 13 14 5, 11 16 15 6 
	
	//5
	//1  2  3  4  5
	//16 17 18 19 6
	//15 24 25 20 7
	//14 23 22 21 8
	//13 12 11 10 9
	//1 2 3 4 5, 16 17 18 19 6, 15 24 25 20 7, 14 23 22 21 8, 13 12 11 10 9
}
