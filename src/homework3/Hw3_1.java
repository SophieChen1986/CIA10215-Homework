package homework3;

import java.util.Scanner;

public class Hw3_1 {
	
	public static void main(String args[]) {
		
		// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
		// 三角形、其它三角形或不是三角形,如圖示結果:
		System.out.println("請輸入三個整數：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Hw3_1 hw3 = new Hw3_1();
		String WhichTriangle = hw3.determineTriangle(a, b, c);
		System.out.println(WhichTriangle);
	}
	
	public String determineTriangle( int a, int b, int c ) {
		
		String result = "";
		
		if ( ( a + b > c ) && ( b + c > a ) && ( c + a > b ) ) {
			
			if ( ( a == b ) && ( b == c ) && (c == a ) ) {
				result = "正三角形";
			}
			else if ( ( a == b ) || ( b == c ) || (c == a ) ) {
				result = "等腰三角形";
			}
			else  {
				result = "其他三角形";
			}
			
		}
		else {
			result = "不是三角形";
		}
		
		return result;
	}
	
}
