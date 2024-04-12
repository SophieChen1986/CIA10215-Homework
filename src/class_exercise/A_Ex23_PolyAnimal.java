package class_exercise;

/*
 * 課堂練習 模組23  練習    講義p.182
 * 
 * 題目：
 * 
 * • 產生一個class，名為PolyAnimal.java • 程式同上一個課堂練習
 * • 在main()裡透過多型來製作
 * 
 * 2024/04/01
 * 
 */

public class A_Ex23_PolyAnimal {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal(2, 5.0f);
		animals[1] = new Elephant(3, 1200f, "大象");
		animals[2] = new Elephant(4, 1100f, "大象2號");
		
		for (int i = 0; i < animals.length; i++  ) {
			animals[i].speak();
		}
		
//		// 所有的父類別是Object
//		Object[] objs = new Object[3];
//		objs[0] = new Animal(2, 5.0f);
//		objs[1] = new Elephant(3, 1200f, "大象");
//		objs[2] = new Elephant(4, 1100f, "大象2號");
		
	}

}
