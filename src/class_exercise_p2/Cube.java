package class_exercise_p2;

public class Cube {
	
	private double sideLength;
	
	public Cube() {}
	
	public Cube( double sideLength ) throws CubeException {
		// 更簡短的寫法 建構子直接呼叫set方法
		setSideLength(sideLength);
		
		// if ( sideLength <= 0 ) {
		// 	throw new CubeException("邊長不可以小於0");
		// }
		// this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(double sideLength) throws CubeException {
		if ( sideLength <= 0 ) {
			throw new CubeException("正立方體邊長不得 為0或是負數");
		}
		this.sideLength = sideLength;
	}
	
	public double getVoumn() {
		return Math.pow(sideLength, 3);
	}
	
}
