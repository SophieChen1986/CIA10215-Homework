package homework1;

public class Homework1 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		int sum = a + b;
		int product = a * b;
		System.out.println("sum = " + sum);
		System.out.println("sum = " + product);
		
		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int numEgg = 200;
		int dozen = numEgg / 12;
		int remainder = numEgg % 12;
		System.out.println("200雞蛋是 " + dozen + "打 " +  remainder + "顆。");
		
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int seconds = 256559;
		int minutes = 256559  / 60;   // 計算分鐘 
		int hours   = minutes / 60;   // 計算小時
		int days    = hours   / 24;   // 計算天數
		
		System.out.println(seconds+"秒為：");
		System.out.println(minutes + "分鐘");
		System.out.println(hours + "小時");
		System.out.println(days + "天");
		
		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		System.out.println("面積: " + 5 * 5 * PI);
		System.out.println("圓周長: " + 2 * 5 * PI);
		System.out.println("");
		
		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		System.out.println("本金加利息: " + 150 * Math.pow((1 + 0.02), 10));
		// 計算公式: https://www.fund.gov.tw/News_Content.aspx?n=3268&s=15185
		
		// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		// 	5 + 5
		// 	5 + ‘5’
		// 	5 + “5”
		// 	並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);     // 整數相加的運算
		System.out.println(5 + '5');   // '5'的ASCII編碼為53，跟整數5運算會被當成整數，所以 5 + 53 = 58
		System.out.println(5 + "5");   // 跟字串運算會被當成字串，所以整數5變成字串，變成字串相接
	}
}
