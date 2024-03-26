package homework2;

public class Homework2_0 {
	public static void main(String args[]) {
		// 一:使用for迴圈 + while迴圈
		System.out.println("一:使用for迴圈 + while迴圈: ");
		for ( int i = 1; i <= 9; i++ ) {
			int j = 1;
			while( j++ <= 9) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 二:使用for迴圈 + do while迴圈
		System.out.println("二:使用for迴圈 + do while迴圈: ");
		for ( int i = 1; i <= 9; i++ ) {
			int j = 1;
			
			do {
				System.out.printf("%4d", i * j);
			} while( j++ < 9 );
			
			System.out.println();
		}
		
		System.out.println();
		
		// 三:使用while迴圈 + do while迴圈
		System.out.println("三:使用while迴圈 + do while迴圈: ");
		int i = 1;
		while( i <= 9 ) {
			int j = 1;
			do {
				System.out.printf("%4d", i * j);
			} while( j++ < 9 );  // 因為是做 N+1次，所以要小於9
			
			System.out.println();
			i++;
		}		
	}
}
