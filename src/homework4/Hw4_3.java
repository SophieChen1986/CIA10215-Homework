package homework4;
/*
 * • 有個字串陣列如下 (八大行星):
 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
 * 
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * (提示:字元比對,String方法)
 * 
 * */

public class Hw4_3 {

	public static void main(String[] args) {
		
		String[] planet = {"mercury", "venus", "earth","mars",
						   "jupiter", "saturn", "uranus", "neptune"};
		
		int numVowel = 0;
		
		int planetLen = planet.length;
		for (int i = 0; i < planetLen; i++) {
			int strLen = planet[i].length();
			
			for (int j = 0; j < strLen; j++) {
				char aChar = planet[i].charAt(j);
				
				if ( aChar == 'a' || aChar == 'e' || aChar == 'i' ||
					 aChar == 'o' || aChar == 'u') {
					numVowel++;
				}
			}
		}
		
		System.out.println("母音有 " + numVowel + " 個");
	}
	
}








