package basic;

import java.util.ArrayList;

public class RemoveRedundancy {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		System.out.println(arrayList);
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 1; j < arrayList.size(); j++) {
				if (arrayList.get(i) != arrayList.get(j)) {
					if (!arrayList2.contains(arrayList.get(j))) {
						if (count == 0) {
							arrayList2.add(arrayList.get(0));
							count += 1;
						}
						arrayList2.add(arrayList.get(j));
					}

				} else {

				}
			}
		}

		System.out.println(arrayList2);
	}
}
