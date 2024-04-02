package class_exercise;

/*
 * 課堂練習 模組21-1  練習    講義p.171
 * 
 * 題目：
 * 
 * • 建立一個class，名為Elephant並延伸自Animal類別
• 此類別有一個成員變數為name(名字 – 型別String)
• 此類別需宣告有參數的建構子
• 有一覆寫成員方法名為speak()，用來印出父類別的兩個成員變數和自己的成員變數
• 在main()裡透過建構子產生兩個物件:
- 其一為Animal，其年紀和體重分別為3歲、8.0公斤
- 另一為Elephant，其年紀、體重和種類名稱分別為8歲、1200.0公斤、大象
• 列印上述兩種Animal的值
 * 
 * 
 * 2024/03/28
 * 
 */

public class A_Ex21_1 {

	public static void main(String args[]) {
		
		Animal animal = new Animal(3, 8.0f);
		Elephant elephant = new Elephant(8, 1200.0f, "大象");
		
		animal.speak();
		
		System.out.println();
		
		elephant.speak();
		
	}
	
}
