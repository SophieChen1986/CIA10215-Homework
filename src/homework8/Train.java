package homework8;

import java.util.Objects;

//火車類別
public class Train implements Comparable<Train> {

	private int number;    // 班次
	private String type;   // 車種
	private String start;  // 出發地
	private String dest;   // 目的地
	private double price;  // 票價
	
	public Train() {}
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	// eclipse產生get/set方法:
	// 對類別名稱按右鍵，
	// 選 Source-> Generate Getters and Setters...
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "(" + 
				number + ", " + 
				type + ", " + 
				start + ", " +
				dest + ", " +
				price + ")";
	}
	// 講義p205
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}

	@Override
	public int compareTo(Train o) {
//		if ( number == o.number ) return 0;
		return number > o.number ? 1 : -1;
	}
	// 講義p316
	
}
