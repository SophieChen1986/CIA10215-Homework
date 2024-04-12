package homework4;

/*
 *  • 請建立一個字串,經過程式執行後,輸入結果是反過來的
 *  例如String s = “Hello World”,執行結果即為dlroW olleH
 *  (提示:String方法,陣列)
 *  
*/

public class Hw4_2 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		// 用最基礎的方法
		int len = str.length();
		for (int i = len-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
//		// 使用StringBuilder的方法
//        String original = "Hello, World!";
//        String reversed = new StringBuilder(original).reverse().toString();
//        System.out.println("Reversed string: " + reversed);
		
	}
	
}
