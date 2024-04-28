package homework5;

/*
• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,
請設計一個方法genAuthCode(),當呼叫此方法時,
會回傳一個8位數的驗證碼,
此驗證碼內容包含了英文大小寫與數字的亂數組合
 * 
 * */

public class Hw5_5 {

	public static void main(String[] args) {
		
		System.out.println("本次隨機產生驗證碼為:");
		
		Hw5_5 hw5_5 = new Hw5_5();
		
		System.out.println( hw5_5.genAuthCode() );
	}

	String genAuthCode() {
		
		final int Table_SIZE = 62;
		int[] myCodeTable = new int[Table_SIZE];  // 10 + 26 + 26 = 62

		int tableIndex = 0;
		
		// 初始化 0 ~ 9
		for (; tableIndex < 10; tableIndex++) {
			myCodeTable[tableIndex] = '0' + tableIndex;
		}

		// 初始化 'a' ~ 'z'
		// 初始化 'A' ~ 'Z'
		for (int i = 0; i < 26; i++) {
			myCodeTable[i+tableIndex] = 'a' + i;
			myCodeTable[i+tableIndex+26] = 'A' + i;
		}
		
		// 驗證表格生成正確
		// for (int i = 0; i < Table_SIZE; i++) {
		// 	System.out.println((char)myCodeTable[i]);
		// }

		
		StringBuilder authCodeSB = new StringBuilder("");
		// 使用 StringBuilder 效能更好
		// String authCode = "";
		for (int i = 0; i < 8; i++) {
			int randomCharIndex = (int)(Math.random() * Table_SIZE);
			authCodeSB.append((char)myCodeTable[randomCharIndex]);

			//authCode += (char)myCodeTable[randomCharIndex];
		}
		
		return authCodeSB.toString();
	}
}
