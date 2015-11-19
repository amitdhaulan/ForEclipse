package test.scenario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestStrings {
	public static void main(String[] args) {

		
		/*String str1 = new String("amit");
		String str2 = "amit";

		System.out.println("Comparing with Equals Method : "
				+ str1.equals(str2));
		System.out.println("Comparing with == : " + (str1 == str2));*/
		 

		
		/*HashMap<String, String> hashMap1 = new HashMap<String, String>();
		String s = "Sachin";
		hashMap1.put(s, "Sachin");
		System.out.println("HashCode of " + s + "=> " + s.hashCode());
		s = "Amit";
		hashMap1.put(s, "Amit");
		System.out.println("HashCode of " + s + "=> " + s.hashCode());
		System.out.println(hashMap1);

		System.out.println();*/
		 

		
		/*HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		Integer i = 10;
		hashMap.put(i, i);
		System.out.println("HashCode of " + i + " => " + i.hashCode());
		System.out.print("Comparing hashCodes of " + i);
		i = 20;
		hashMap.put(i, i);
		System.out.println(" and " + i + " => "
				+ (i.hashCode() == i.hashCode()));
		System.out.println("HashCode of " + i + " => " + i.hashCode());

		System.out.println(hashMap);*/
		 

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++) {
			arrayList.add(i);
		}
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		for (int i = 0; i < 10; i++) {
			arrayList.add(2);
			arrayList.add(3);
			arrayList.add(4);
			arrayList.add(99);
		}

		/*System.out.println(arrayList);*/

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			int count = 0;
			for (int j = 0; j < arrayList.size(); j++) {
				if (arrayList.get(i) == arrayList.get(j)) {
					count = count + 1;
					hashMap.put(arrayList.get(i), count);
				}
			}
		}

		System.out.println("Map: " + hashMap);

		Set<Map.Entry<Integer, Integer>> maps = hashMap.entrySet();
		for (Map.Entry<Integer, Integer> entry : maps) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key + "=>" + value + " " + "\t");

		}

		/*System.out.println();
		String string = "amit kumar singh kashyap";
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}*/

	}

}
