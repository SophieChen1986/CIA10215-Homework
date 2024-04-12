package homework4;

import java.util.Scanner;

/*• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,
 * 執行後會顯示是該年的第幾天
 * 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
 * 
 * (提示1:Scanner,陣列)
 * (提示2:需將閏年條件加入)
 * (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
 * 
 * */

public class Hw4_5 {

	public static void main(String[] args) {
		
		int[] dayOfMonthTable = { 31, 28, 31, 30, 31, 30,
							      31, 31, 30, 31, 30, 31 };
		
		System.out.println("輸入三個整數,分別代表西元yyyy年,mm月,dd日: ");
		
		Scanner sc = new Scanner(System.in);
		int year  = sc.nextInt();
		int month = sc.nextInt();
		int day   = sc.nextInt();
		int dayCount = 0;
		
		// 最直接的方法判斷
		dayCount+= day;
		for ( int i = 0; i < month-1; i++ ) {
			dayCount += dayOfMonthTable[i];
		}
		if ( year % 4 == 0 ) {
			dayCount++;
		}
		
		System.out.println(dayCount);
	}
	
}


// 測試資料: 1984 9 8