
public class Sprials {

	private static String[][] grid;
	@SuppressWarnings("unused")
	private static int padding;
	
	public static void main(String[] args) {
		for(int i = 1; i <= 15; i++) {
			spiralYo(i);
			System.out.println();
		}
	}
	
	public static void spiralYo(int size) {
		padding = String.valueOf(size*size).length();
		grid = new String[size][size];
		addNumbersRight(0,0,1,size);
		printGrid(size);
	}
	
	public static void addNumbersRight(int startX, int startY, int current, int amount) {
		for(int i = 0; i < amount; i++) {
			grid[startX + i][startY] = addZeros(current + i);
		}
		if(!(amount == 1)) {
			addNumbersDown(startX + amount - 1, startY + 1, current + amount, amount - 1);
		}
		
	}
	public static void addNumbersDown(int startX, int startY, int current, int amount) {
		for(int i = 0; i < amount; i++) {
			grid[startX][startY + i] = addZeros(current + i);
		}
		addNumbersLeft(startX - 1, startY + amount - 1, current + amount, amount);
	}
	public static void addNumbersLeft(int startX, int startY, int current, int amount) {
		for(int i = 0; i < amount; i++) {
			grid[startX - i][startY] = addZeros(current + i);
		}
		if(!(amount == 1)) {
			addNumbersUp(startX - (amount - 1), startY - 1, current + amount, amount - 1);
		}
	}
	public static void addNumbersUp(int startX, int startY, int current, int amount) {
		for(int i = 0; i < amount; i++) {
			grid[startX][startY - i] = addZeros(current + i);
		}
		addNumbersRight(startX + 1, startY - (amount- 1), current + amount, amount);
	}
	
	public static void printGrid(int size) {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				System.out.print(grid[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static String addZeros(int number) {
		String zeros = "";
		for (int i = String.valueOf(number).length(); i < padding; i ++) {
			zeros = zeros + "0";
		}
		return zeros + Integer.toString(number);

	}

}
