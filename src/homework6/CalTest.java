package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	static public void main( String agrs[] ) {
		
		Calculator calculator = new Calculator();
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("請輸入x的值:");
			int x = sc.nextInt();
			System.out.print("請輸入y的值:");
			int y = sc.nextInt();
			
			System.out.println(x + "的" + y + "次方等於" + calculator.powerXY(x, y));
			
			sc.close();
			
		} catch ( CalException e ) {
			// 自定義的 CalException
			System.out.println(e.getMessage());
		}
		catch ( InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}
	}
}
