package class_exercise;

/*
 * 課堂練習 模組13-1  練習    講義p.124
 * 
 * 題目：
 * 
 * • 請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡， 再將結果顯示於螢幕上• x和y陣列中的數字:
 * • 請用亂數產生介於0~30之間的整數
 * • 亂數之取得可參考java.lang.Math的靜態方法random()
 * • publicstaticdoublerandom() .傳回亂數值其範圍為0.0~1.0
 * 
 * 2024/03/27
 * 
 */

public class A_Ex13_1 {
	
	// 陣列維度
	final int DSIZE = 3;

	public static void main(String args[]) {
		
		A_Ex13_1 testRandom = new A_Ex13_1();

		int[][] x = testRandom.getRandomArray();
		int[][] y = testRandom.getRandomArray();
		int[][] z = new int[3][3];

		int rowSize = z.length;
		for(int i = 0; i < rowSize; i++) {
			int colSize = z[i].length;
			for(int j = 0; j < colSize; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		testRandom.printArray(x);
		testRandom.printArray(y);
		testRandom.printArray(z);
	}
	
	public int[][] getRandomArray() {
		int[][] data = new int[DSIZE][DSIZE];

		int rowSize = data.length;
		for(int i = 0; i < rowSize; i++) {
			int colSize = data[i].length;
			for(int j = 0; j < colSize; j++) {
				data[i][j] = (int) (Math.random() * 31);
			}
		}
		return data;
	}

	public void printArray(int[][] data) {
		int rowSize = data.length;
		for(int i = 0; i < rowSize; i++) {
			int colSize = data[i].length;
			for(int j = 0; j < colSize; j++) {
				System.out.printf("%3d", data[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}
	
}
