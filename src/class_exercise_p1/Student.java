package class_exercise_p1;

public class Student {
	
	int score = 90;
	
	public void play( int hours ) {
		score -= hours;
		
//		System.out.println("目前分數 = " + score);
	}
	
	public void study( int hours ) {
		score += hours;
		
//		System.out.println("目前分數 = " + score);
	}
	
}
