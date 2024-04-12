package homework4;

/*
 * • 有個一維陣列如下:
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * (提示:陣列,length屬性)
 * 
 * */

public class Hw4_1 {
	public static void main(String[] args) {
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		
		int sum = 0;
		
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		
		int average = sum/len;
		
		System.out.println("平均值 = " + average );
		
		System.out.println("大於平均值的元素：");
		for (int i = 0; i < len; i++) {
			if ( arr[i] >= average ) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}
}
