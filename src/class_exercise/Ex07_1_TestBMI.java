package class_exercise;

// Java課堂練習 p77
public class Ex07_1_TestBMI {
	public static void main(String args[]) {
		// 分而為之，拆分步驟
		
		// step 1; 建立身高跟體重資料
		double height = 160.0, weight = 50.0;

		// step 2: 進行運算得到並顯示BMI
		height = height / 100;
		// double bmi = weight / (height * height);
		double bmi = weight / Math.pow(height, 2);

		// System.out.println("BMI is " + bmi);
		System.out.printf("BMI is %.2f%n", bmi);  // 只顯示到小數點後兩位
		// %n 也可以用來當做 \n
		
		// step 3: 根據條件顯示對應的結果
		if ( bmi < 18.5 ) {
			System.out.println("過瘦");
		}
		else if ( bmi >= 24 ) {
			System.out.println("過重");
		}
		else {
			System.out.println("正常");
		}
	}
}
