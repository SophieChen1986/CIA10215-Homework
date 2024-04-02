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

public class Animal {
	
	private int age;
	private float weight;
	
	public Animal() {
		// 1. 保留給子類別super呼叫的彈性
		// 2. 無參數建構子也是Java Bean的規範之一
		// 3. 給日後搭配框架呼叫使用 (框架幫我們建立物件就是呼叫此建構子)
	}
	
	public Animal( int age, float weight ) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println( age + "歲 " + weight + "公斤" );
	}
	
}
