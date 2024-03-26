package class_exercise;

/*
 * 課堂練習 模組10-3  練習    講義p.106
 * 
 * 題目：
 * • 請新增一個Student類別，並宣告一個屬性為score，型別為int，另宣告兩 個方法分別為play()與study()，功能如下:
 * • publicvoidplay(inthours) 每休息一個小時，score就會減1
 * • publicvoidstudy(inthours) 每讀書一個小時，score就會加1
 * • 該類別完成後，請在main方法裡創建兩個student物件，並藉由呼叫play() 與study()並取得分數是否正確
 *
 * 2024/03/23
 * 
*/

public class Ex10_3 {
	
	public static void main(String args[]) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.study(1);
		student1.play(1);
		
		student2.study(3);
		student2.play(4);
		
		System.out.println(student1.score);
		System.out.println(student2.score);
	}
	
}
