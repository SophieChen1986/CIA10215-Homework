package homework7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 請自行建立一個文字檔Sample.txt
 * 請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
 * Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
 * 
 * */

public class Hw7_1 {
	
	static public void main( String agrs[] ) {
		
		final String filename = "Sample.txt";
		int byteCount = 0;    // 計算位元組
		int charCount = 0;    // 計算字元
		int lineCount = 0;    // 計算幾列
		
		
		// 取得 位元組
		try {
			FileInputStream is = new FileInputStream(filename);
			while(is.read() != -1) {
				byteCount++;
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 參考講義: p255  上方
		
		
		// 取得 個字元
		try {
			FileReader fr = new FileReader(filename);
			while(fr.read() != -1) {
				charCount++;
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 參考講義: p255  下方
		
		
		// 取得 幾列資料
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);

			while( br.readLine() != null ) {
				lineCount++;
			};
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 參考講義: p266
		
		
		System.out.print("Sample.txt檔案共有" + 
				byteCount + "個位元組，" + 
				charCount + "個字元，" + 
				lineCount + "列資料");
		
	}
	
}
