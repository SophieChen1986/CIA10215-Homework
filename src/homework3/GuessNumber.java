package homework3;

import java.util.Scanner;

public class GuessNumber {
	
	// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,
	// 猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
	
	void playGame1() {
		// 亂數產生一個數字
		int targetNum = (int) (Math.random() * 10);
		// 是否猜對
		boolean isGuessRight = false;
		
		System.out.println("開始猜數字吧! (請輸入0~9)");
		do {
			System.out.println("請輸入數字:");

			// 輸入用的元件
			Scanner sc = new Scanner(System.in);
			int enterNum = sc.nextInt();
			
			if ( targetNum == enterNum ) {
				System.out.println("答對了!答案就是" + targetNum);
				isGuessRight = true;
			}
			else {
				System.out.println("猜錯囉!");
			}
			
		} while( isGuessRight == false );
	}
	
	void playGame2() {
		// 亂數產生一個數字
		int targetNum = (int) (Math.random() * 100 + 1);  // 0 ~ 100
		// 是否猜對
		boolean isGuessRight = false;
		
		System.out.println("開始猜數字吧! (請輸入0 ~ 100)");
		do {
			System.out.println("請輸入數字:");

			// 輸入用的元件
			Scanner sc = new Scanner(System.in);
			int enterNum = sc.nextInt();
			
			if ( targetNum > enterNum ) {
				System.out.println("大於");
			}
			else if ( targetNum < enterNum ) {
				System.out.println("小於");
			}
			else if ( targetNum == enterNum ) {
				System.out.println("答對了!答案就是" + targetNum);
				isGuessRight = true;
			}
			else {
				System.out.println("猜錯囉!");
			}
			
		} while( isGuessRight == false );
	}
	
}
