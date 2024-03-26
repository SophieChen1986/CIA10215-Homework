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
 * 2024/03/23
 * 
 */

public class Ex13_1 {
	
	public static void main(String args[]) {
		
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		int dLen = 3;
		for(int i = 0; i < dLen; i++) {
			for(int j = 0; j < dLen; j++) {
				x[i][j] = (int) ( Math.random() * 30 );
				y[i][j] = (int) ( Math.random() * 30 );
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		for(int i = 0; i < dLen; i++) {
			for(int j = 0; j < dLen; j++) {
				System.out.printf("%3d", x[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\n");
		
		for(int i = 0; i < dLen; i++) {
			for(int j = 0; j < dLen; j++) {
				System.out.printf("%3d", y[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\n");
		
		for(int i = 0; i < dLen; i++) {
			for(int j = 0; j < dLen; j++) {
				System.out.printf("%3d", z[i][j]);				
			}
			System.out.println("");
		}
		
	}
	
}
