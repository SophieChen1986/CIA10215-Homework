package homework5;

public class Hw5_4 {

	public static void main(String[] args) {

		// (1) 使用public MyRectangle()建構子建立物件，
		// 設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle rec1 = new MyRectangle();
		rec1.setWidth(10);
		rec1.setDepth(20);
		
		System.out.println( rec1.getArea() );
		
		
		// (2) 使用public MyRectangle(double width, double depth)
		// 建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle rec2 = new MyRectangle(10, 20);
		
		System.out.println( rec2.getArea() );
	}

}
