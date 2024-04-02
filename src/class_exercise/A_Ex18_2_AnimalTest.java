package class_exercise;

/*
 * 課堂練習 模組18-2  練習1    講義p.152
 * 
 * 題目：
 * • 建立一個class，名為Animal.java
課堂練習
• 此類別有兩個成員變數分別為age(年紀-型別int)、weight(體重-型別float)
• 此類別需宣告有參數的建構子
• 有一成員方法名為speak()，用以列印上述兩個值
• 在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0 公斤，
並呼叫speak方法得到此Animal的成員變數值
 * 
 * 2024/03/28
 * 
 */

public class A_Ex18_2_AnimalTest {
	
	public static void main(String args[]) {
		
		Animal animal = new Animal(2, 5.0f);
		
		animal.speak();
	}
	
}
