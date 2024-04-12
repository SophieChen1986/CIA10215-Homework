package class_exercise_25;

// 練習 介面 的實作

public class WeightTest {
	
	public static void main(String[] args) {
		
		Weightable[] myWeightable = new Weightable[3];
		
		myWeightable[0] = new Dog();
		myWeightable[1] = new Plane();
		myWeightable[2] = new Powder();
		
		for (int i = 0; i < 3; i++) {
			myWeightable[i].printWeightTool();
		}
	}
	
}
