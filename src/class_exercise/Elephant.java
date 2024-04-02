package class_exercise;

public class Elephant extends Animal {
	
	String name;
	
	Elephant( int age, float weight, String name ) {
		super( age, weight );
		this.name = name;
	}
	
	// 不會報錯，因為編譯器理解成overloading(多載)了
	// 一個是speak(int data)，另一個是父類別繼承來的speak()
	public void speak(int data) {
		super.speak();
		
		System.out.println( "名字: " + name );
	}
	
//	public void speak() {
//		super.speak();
//		
//		System.out.println( "名字: " + name );
//	}
	
	// JDK 5 Annotation (標註) : 給Java相關工具或是框架看的資訊
	// 給編譯器看的資訊   如果沒寫好會報錯
	@Override   // 讓編譯器對此方法以override規則去檢查，只要有一違反規則就會編譯失敗
	public void speak() {
		super.speak();
		
		System.out.println( "名字: " + name );
	}
	
}
