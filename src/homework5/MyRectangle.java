package homework5;

public class MyRectangle {
	
	private double width;
	private double depth;
	
	public MyRectangle() {}
	
	MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
	}
	
	void setWidth( double width ) {
		this.width = width;
	}
	
	void setDepth( double depth ) {
		this.depth = depth;
	}
	
	// 能計算該長方形的面積
	double getArea() {
		return width * depth;
	}
	
}
