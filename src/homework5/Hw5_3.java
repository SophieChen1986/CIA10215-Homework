package homework5;

/*
 * 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]), 可以找出二維陣列的最大值並回傳。
 * 
 * */

public class Hw5_3 {

	public static void main(String[] args) {

		int[][] intArray = {
				{ 1, 6, 3 },
				{ 9, 5, 2 }
		};
		
		double[][] doubleArray = {
				{ 1.2, 3.5, 2.2 },
				{ 7.4, 2.1, 8.2 }
		};
		
		Hw5_3 hw5_3 = new Hw5_3();
		
		System.out.println(hw5_3.maxElement(intArray));
		System.out.println(hw5_3.maxElement(doubleArray));
	}
	
	// 兩個一模一樣的方法
	int maxElement(int x[][]) {
		int maxInt = x[0][0];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				maxInt = x[i][j] > maxInt ? x[i][j] : maxInt;
			}
		}
		
		return maxInt;
	}
	
	double maxElement(double x[][]) {
		
		double maxDouble = x[0][0];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				maxDouble = x[i][j] > maxDouble ? x[i][j] : maxDouble;
			}
		}
		
		return maxDouble;
	}

}
