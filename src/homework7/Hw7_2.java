package homework7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Hw7_2 {
	
	/*
	 * 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡
	 * (請使用append功能讓每次執行結果都能被保存起來)
	 * 
	 * 參考講義: p277
	 * 參考程式: OutputStreamChain.java
	 * 
	 * */

	public static void main(String[] args) {
		
		final int TOTALNUM = 10;
		
		try {
			FileOutputStream fos = new FileOutputStream("Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			
			System.out.print("新增資料: ");
			for (int i = 0; i < TOTALNUM; i++) {
				int randomNum = (int) (Math.random() * 1000 + 1);
				
				ps.print(randomNum);
				System.out.print(randomNum);
				if ( i != TOTALNUM -1 ) {
					ps.print(' ');
					System.out.print(' ');
				}
			}
			ps.println();
			System.out.println();
			
			ps.close();
			bos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("找不到檔案。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
