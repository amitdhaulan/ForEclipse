package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DynamicNamesToArrays {
	public static void main(String[] args) {
		Map<Integer, ArrayList<String>> kMap = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> arrayList;
		int size = kMap.size();

		for (int i = 0; i < 5; i++) {
			kMap.put(i, new ArrayList<String>());
		}
		size = kMap.size() - 1;
		do {

			switch (size) {
			case 0:
				// names
				arrayList = new ArrayList<>();
				arrayList.add("amit");
				arrayList.add("ajay");
				arrayList.add("sanjay");
				kMap.put(0, arrayList);
				break;
			case 1:

				// designation
				arrayList = new ArrayList<>();
				arrayList.add("java developer");
				arrayList.add("tester");
				arrayList.add("dot net developer");
				kMap.put(1, arrayList);

				break;
			case 2:

				// address
				arrayList = new ArrayList<>();
				arrayList.add("Meerut");
				arrayList.add("Noida");
				arrayList.add("Gurgaon");
				kMap.put(2, arrayList);

				break;
			case 3:

				// company
				arrayList = new ArrayList<>();
				arrayList.add("ecifm");
				arrayList.add("NIIT");
				arrayList.add("oracle");
				kMap.put(3, arrayList);

				break;
			case 4:

				// field
				arrayList = new ArrayList<>();
				arrayList.add("IT");
				arrayList.add("IT");
				arrayList.add("Mechanical");
				kMap.put(4, arrayList);

				break;

			default:
				break;
			}
			size = size - 1;
		} while (size >= 0);

		System.out.println(kMap.get(0));
		System.out.println(kMap.get(1));
		System.out.println(kMap.get(2));
		System.out.println(kMap.get(3));
		System.out.println(kMap.get(4));
	}
}
