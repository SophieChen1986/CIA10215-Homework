package class_exercise_p1;

/*
 * 課堂練習 模組8-2  練習1    講義p.87
 * 
 * 題目：
 * 請建立一個Test4Numbers.java，可輸出0~100裡4的倍數
 * 
 * 2024/03/22
 * 
 */

public class A_Ex08_2_Test4Numbers {
	
	public static void main(String args[]) {
		
//		for (int i = 0; i <= 100; i++) {
//			if ( i % 4 == 0 ) {
//				System.out.println(i);
//			}
//		}
		
		// 另一種寫法 
		for (int i = 0; i <= 100; i+=4) {
			System.out.print(i + " ");
		}
		
	}
	
}
