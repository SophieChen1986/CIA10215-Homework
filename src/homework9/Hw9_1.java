package homework9;

public class Hw9_1 {
	
	/*
	 * • 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的 競賽過程。
	 * • 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
	 *   Sleep時間由亂數產生500~3000之間的毫秒數，如圖所示
	 * • 參考範例:CounterRunnable.java
	 * • 需留主執行緒執行順序
	 * 
	 * 參考講義: p336
	 * 參考範例: TestJoin.java
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始！-----");
		
		Participant James = new Participant("詹姆士");  // 詹姆士
		Participant Moon = new Participant("饅頭人");   // 饅頭人
		// 名字英文參考: https://zh.wikipedia.org/zh-tw/LINE_Friends
		
		Thread jamesThread = new Thread(James);  // 詹姆士 產生執行序
		Thread moonThread = new Thread(Moon);    // 饅頭人 產生執行序
		
		jamesThread.start();  // 詹姆士 開始吃飯
		moonThread.start();   // 饅頭人 開始吃飯
		
		// 等待大家吃完
		// 等待Thread結束
		try {
			jamesThread.join();
			moonThread.join();
		} catch (InterruptedException e) {
			System.out.println("執行緒被中斷。");
		}
		
		System.out.println("-----大胃王快食比賽結束！-----");
	}

}
