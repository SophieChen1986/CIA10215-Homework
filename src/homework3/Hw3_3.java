package homework3;

import java.util.Scanner;

public class Hw3_3 {

	public static void main(String[] args) {
		
		// • 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
		// 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
		// 的號碼與總數,如圖:
		
		System.out.print("輸入討厭的數字: ");
		
		Scanner sc = new Scanner(System.in);
		int enterNum = sc.nextInt();
		
		int[] reservedNumber = new int[50];
		
		int okNumCount = 0;
		for (int i = 1; i <= 49; i++) {
			if ( !(i / 10 == enterNum || i % 10 == enterNum) ) {
				System.out.print(i + "\t");
				
				reservedNumber[okNumCount] = i;
				okNumCount++;
			}
			if ( okNumCount % 6 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("阿文可以選擇的數字有 " + okNumCount + "個");
		
		// 確認記錄表正確性
		// for(int i = 0; i < okNumCount; i++) {
		// 	System.out.println(i + " " + reservedNumber[i]);
		// }
		
		System.out.println("電腦選號:");
		
		// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		for(int i = 0; i < 6; i++) {
			boolean selectOk = false;
			
			do {
				int randomIndex = (int) (Math.random() * okNumCount);
				if ( reservedNumber[randomIndex] != 0 ) {
					
					System.out.print(reservedNumber[randomIndex] + " ");
					
					reservedNumber[randomIndex] = 0;
					
					selectOk = true;
				}
				
			} while( selectOk == false );
			
		}
		
	}

}
