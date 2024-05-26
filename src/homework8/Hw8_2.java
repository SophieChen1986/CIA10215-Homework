package homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_2 {

	/*
	 * 請設計一個Train類別，並包含以下屬性:
	 * - 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
	 * - 目的地 dest，型別為String - 票價 price，型別為double
	 * 
	 * 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
	 * 
	 * - (202, "普悠瑪", "樹林", "花蓮", 400) - (1254, "區間", "屏東", "基隆", 700) - (118, "自強", "高雄", "台北", 500)
	 * - (1288, "區間", "新竹", "基隆", 400) - (122, "自強", "台中", "花蓮", 600)
	 * - (1222, "區間", "樹林", 七堵, 300)
	 * - (1254, "區間", "屏東", "基隆", 700)
	 * 
	 * • 請寫一隻程式，能印出不重複的Train物件
	 *   // 參考講義p313
	 * 
	 * • 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
	 *   // 講義p316
	 * 
	 * • 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
	 * • (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
	 * 
	*/
	
	public static void main(String[] args) {
		
		// 印出不重複的Train物件
		// 使用Set的HashSet集合 (無特定順序，不允許重複)
		Set<Train> trainSet1 = new HashSet<Train>();
		System.out.println("印出不重複的Train物件:");
		trainSet1.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet1.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet1.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet1.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet1.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		Iterator<Train> myIterator = trainSet1.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		System.out.println("===================================");
		
		// 以班次編號由大到小印出
		// 使用List的ArrayList集合 (有特定順序，允許重複)
		ArrayList<Train> trainSet2 = new ArrayList<Train>();
		System.out.println("Train物件印出時，能以班次編號由大到小印出:");
		trainSet2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet2.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet2.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		Collections.sort(trainSet2);
		for ( int i = 0; i < trainSet2.size(); i++ ) {
			Object obj = trainSet2.get(i);
			System.out.println(obj);
		}
		System.out.println("===================================");
		
		// 能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		// 使用Set的TreeSet集合 (不允許重複，支援大小排列)
		Set<Train> trainSet3 = new TreeSet<Train>();
		System.out.println("不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件:");
		trainSet3.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet3.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet3.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet3.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet3.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet3.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet3.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet3.forEach(train -> {
		    System.out.println(train);
		});
		System.out.println("===================================");
		
	}

}
