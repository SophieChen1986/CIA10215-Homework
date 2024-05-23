package homework7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Hw7_3 {
	
	/*
	 * 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
	 * 呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案。
	 * 
	 * 參考講義: p279
	 * 參考程式: OutputStreamChain.java
	 * 
	 * 參考講義: p266
	 * 參考程式: ReaderChain.java
	 * 
	 */

	public static void main(String[] args) {
		String fileName1 = "MyFile1.txt";
		String fileName2 = "MyFile2.txt";
		
		Hw7_3 copyFileDemo = new Hw7_3();
		
		copyFileDemo.copyFile1(fileName1, fileName2);  // 比較好的寫法
		// copyFileDemo.copyFile2(fileName1, fileName2);
	}
	
	public void copyFile1(String fileName1, String fileName2) {
		try {
			FileReader fr = new FileReader(fileName1);
			FileWriter fw = new FileWriter(fileName2);
			
			BufferedReader br = new BufferedReader(fr) ;
			
			String str;
			while ((str = br.readLine()) != null) {
				fw.append(str);
			}
			
			br.close();
			fw.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void copyFile2(String fileName1, String fileName2) {
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName2);
			FileInputStream fis = new FileInputStream(fileName1);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			PrintStream ps = new PrintStream(bos);
			
			int input;
			while( ( input = bis.read() ) != -1 ) {
				//ps.print((char)input);   // 檔案有中文字不能這樣寫 
				ps.write((char)input);
			}
			
			ps.close();
			bis.close();
			bos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("找不到檔案。");
		} catch (IOException e) {
			System.out.println("檔案錯誤。");
		}
	}

}
