package homework7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Hw7_5 {
	
	/*
	 * 承上題，請寫一個程式，能讀取Object.ser這四個物件，
	 * 並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
	 * 
	 */

	public static void main(String[] args) throws Exception {
		
		// 若C:\內沒有data資料夾,請用程式新增這個資料夾
		File dir = new File("C:\\data");
		if ( !dir.exists() ) {
			dir.mkdir();
		}
		
		File file = new File("C:\\data\\Object.ser");
		
		// 反序列化
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			while(true) {
				((Animal)ois.readObject()).speak();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("找不到檔案。");
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		} finally {
			if ( ois != null ) ois.close();
			if ( fis != null ) fis.close();
		}

	}

}
