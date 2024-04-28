package homework5;

import java.util.Set;
import java.util.TreeSet;

/*
 * 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
 * 
 * */

public class Hw5_2 {

	public static void main(String[] args) {
		
		Hw5_2 hw5_2 = new Hw5_2();
		
		hw5_2.randAvg(10);
	}
	
	// 整數亂數中取平均值
	void randAvg( int n ) {
		System.out.println("本次亂數結果:");
		
		Set<Integer> randomNumbers = getRandomNumbersBetween0and100( n );

		int sum = 0;
		for(int number: randomNumbers) {
			sum += number;
			
			System.out.print(number + " ");
		}
		
		int avg = sum / n;
		
		System.out.print("\naverage = " + avg);
	}
	
	// 產生n個 0-100 的亂數
	private Set<Integer> getRandomNumbersBetween0and100( int n ) {
		Set<Integer> randomNumbers = new TreeSet<>();
		
		while( randomNumbers.size() < n ) {
			randomNumbers.add( (int) (Math.random() * 101) );
			// 產生 0~100(含100)的整數亂數
		}
		
		return randomNumbers;
	}

}
