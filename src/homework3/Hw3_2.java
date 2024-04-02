package homework3;

public class Hw3_2 {
	// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
	// 對則顯示正確訊息,如圖示結果:
	
	// (提示:Scanner,亂數方法,無窮迴圈)
	
	public static void main(String args[]) {
		
		GuessNumber guessNumber = new GuessNumber();
		
		guessNumber.playGame1();
		
		System.out.println();
		
		// (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		guessNumber.playGame2();
	}
	
}
