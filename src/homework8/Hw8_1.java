package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {
	/*
	 * • 請建立一個Collection物件並將以下資料加入:
	 * Integer(100)、Double(3.14)、Long(21L)、Short("100")、Double(5.1)、
	 * "Kitty"、Integer(100)、Object物件、"Snoopy"、BigInteger("1000")
	 * 
	 * • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
	 * • 移除不是java.lang.Number相關的物件
	 * • 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 建立一個Collection物件並將以下資料加入:
		// Integer(100)、Double(3.14)、Long(21L)、Short("100")、Double(5.1)、
		// "Kitty"、Integer(100)、Object物件、"Snoopy"、BigInteger("1000")
		List<Object> myCollection = new ArrayList<Object>();
		myCollection.add(new Integer(100));
		myCollection.add(new Double(3.14));
		myCollection.add(new Long(21L));
		myCollection.add(new Short("100"));
		myCollection.add(new Double(5.1));
		myCollection.add("Kitty");
		myCollection.add(new Integer(100));
		myCollection.add(new Object());
		myCollection.add("Snoopy");
		myCollection.add(new BigInteger("1000"));
		
		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		System.out.println("=========================");
		
		// 使用Iterator
		System.out.println("使用Iterator: ");
		Iterator<Object> myIterator = myCollection.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		System.out.println("=========================");
		
		// 傳統for迴圈
		System.out.println("傳統for迴圈: ");
		for ( int i = 0; i < myCollection.size(); i++ ) {
			Object obj = myCollection.get(i);
			System.out.println(obj);
		}
		System.out.println("=========================");
		
		// 使用foreach
		System.out.println("foreach迴圈: ");
		for( Object obj : myCollection ) {
			System.out.println(obj);
		}
		System.out.println("=========================");
		
		
		// 移除不是java.lang.Number相關的物件
		myCollection.removeIf(obj -> !(obj instanceof Number));
		System.out.println("移除不是java.lang.Number相關的物件:");
		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		myCollection.forEach(name -> {
		    System.out.println(name);
		});
		
		// 參考講義:
		// 23-1 : instanceof關鍵字
		// p177
		// 參考資料:
		// removeIf()
		// https://www.geeksforgeeks.org/java-collection-removeif-method/
	}

}
