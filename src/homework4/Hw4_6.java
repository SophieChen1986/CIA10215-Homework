package homework4;

import java.util.stream.IntStream;

public class Hw4_6 {
	
	public static void main(String[] args) {
		
		int[][] scoreTable = {{ 10, 37,100, 77, 98, 90},  // 1號
							  { 35, 75, 70, 95, 70, 80},  // 2號 ..
							  { 40, 77, 79, 70, 89,100}, 
							  {100, 89, 90, 89, 90, 75},
							  { 90, 64, 75, 60, 75, 50},
							  { 85, 75, 70, 75, 90, 20},
							  { 75, 70, 79, 85, 89, 99},
							  { 70, 95, 90, 89, 90, 75}};
		
		int[] winFirstRecordTable = new int[8];
		for( int testIndex = 0; testIndex < 6; testIndex++ ) {   // 6次考試
			int maxScore = scoreTable[0][testIndex];  // 預設第一位考最高
			int maxScoreStIndex = 0;
			
			for ( int stIndex = 1; stIndex < 8; stIndex++ ) {  // 第一個人不用比
				if ( scoreTable[stIndex][testIndex] > maxScore ) {
					maxScore = scoreTable[stIndex][testIndex];
					maxScoreStIndex = stIndex;
				}
			}
			
			winFirstRecordTable[maxScoreStIndex]++;
		}
		
		System.out.println("每位同學考最高分的次數:");
		
		for ( int stIndex = 0; stIndex < 8; stIndex++ ) {
			System.out.println("第" + (stIndex+1) + "位同學 " + winFirstRecordTable[stIndex] + " 次");
		}
		
//		// ChatGPT給的優化方式:
//		int[][] scoreTable = {
//	            { 10, 37,100, 77, 98, 90},
//	            { 35, 75, 70, 95, 70, 80},
//	            { 40, 77, 79, 70, 89,100},
//	            {100, 89, 90, 89, 90, 75},
//	            { 90, 64, 75, 60, 75, 50},
//	            { 85, 75, 70, 75, 90, 20},
//	            { 75, 70, 79, 85, 89, 99},
//	            { 70, 95, 90, 89, 90, 75}
//	        };
//
//	        int[] winFirstRecordTable = new int[8];
//
//	        IntStream.range(0, 6).forEach(testIndex -> {
//	            int maxScoreStIndex = IntStream.range(0, 8)
//	                .reduce((i, j) -> scoreTable[i][testIndex] >= scoreTable[j][testIndex] ? i : j)
//	                .getAsInt();
//	            winFirstRecordTable[maxScoreStIndex]++;
//	        });
//
//	        System.out.println("每位同學考最高分的次數:");
//	        IntStream.range(0, 8).forEach(stIndex ->
//	            System.out.println("第" + (stIndex + 1) + "位同學 " + winFirstRecordTable[stIndex] + " 次")
//	        );
		
	}
	
}
