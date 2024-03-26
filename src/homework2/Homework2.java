package homework2;

public class Homework2 {
	
	public static void main(String args[]) {
		
		// 阿文很熱衷大樂透 (1 ~ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		// 請設計一隻程式， 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int okNumCount = 0;
		for (int i = 1; i <= 49; i++) {
			if ( !(i / 10 == 4 || i % 10 == 4) ) {
				System.out.print(i + " ");
				okNumCount++;
			}
		}
		System.out.println();
		System.out.println("阿文可以選擇的數字有 " + okNumCount + "個");
		
		
		/*
		 • 請設計一隻Java程式，輸出結果為以下:
			1 2 3 4 5 6 7 8 9 10
			123456789
			12345678
			1234567
			123456
			12345
			1234
			123
			12
			1
		 */
		for (int i = 1 ; i <= 10; i++) {
			for (int j = 1; j <= 10-i+1; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		
		/*
		 • 請設計一隻Java程式，輸出結果為以下:
			A
			BB
			CCC
			DDDD
			EEEEE
			FFFFFF
		 */
		for (char i = 'A'; i <= 'F'; i++) {
			for ( int j = 0; j <= i - 'A'; j++ ) {
				System.out.print( i );
			}
			System.out.println("");
		}
		
	}

	
}
