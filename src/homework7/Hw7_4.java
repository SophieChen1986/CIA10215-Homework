package homework7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Hw7_4 {
	
	/*
	 * 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,
	 * 寫到C:\data\Object.ser裡。注意物件寫入需注意的事項,
	 * 若C:\內沒有data資料夾,請用程式新增這個資料夾
	 * 
	 * 參考講義: p279, p280
	 * 參考程式: ObjectInOut.java
	 * 
	 */
	
	public static void main(String[] args) throws Exception {
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Dog("Puppy1");
		animals[1] = new Dog("Puppy2");
		animals[2] = new Cat("Kitty1");
		animals[3] = new Cat("Kitty2");
		
		File file = new File("C:\\data\\Object.ser");
		
		// 序列化
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try {
			for (int i = 0; i < animals.length; i++)
				oos.writeObject(animals[i]);
			
			System.out.println("寫入完成。");
		} catch(IOException e) {
			System.err.println("發生錯誤。");
		}
		
		oos.close();
		fos.close();
	}
}
