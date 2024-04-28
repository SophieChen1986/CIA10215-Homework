package class_exercise_p2;

/*
 * 課堂練習 Java2 模組4-1:自訂例外  練習    講義p.237
 * 
 * 題目：
 * • 請建立一個正立方體Cube.java檔案，並定義邊長屬性(double length)，建構子(Constructor)與getter/setter方法
 * 
 * • 產生一個cube物件並同時傳入邊長值，若是值為0或負數，則拋 出自行定義的例外CubeException，並顯示「正立方體邊長不得 為0或是負數」的訊息
 * 
 * • 若是傳入邊長的值沒有問題，則顯示體積
 * 
 * 2024/04/14
 * 
 */

public class A_Ex04_1_CubeTest {

	public static void main(String[] args) {
		
		try {
			Cube myCube1 = new Cube(10);  // -10
			System.out.print("體積:" + myCube1.getVoumn());
			
//			Cube myCube2 = new Cube();
//			myCube2.setSideLength(-2);
			
		} catch (CubeException e) {
			
			e.printStackTrace();
		}
		
	}

}
