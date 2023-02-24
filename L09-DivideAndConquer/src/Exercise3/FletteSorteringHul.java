package Exercise3;

import java.util.ArrayList;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>();

		int leftIndex = low;
		int rightIndex = middle + 1;

		while (leftIndex <= middle && rightIndex <= high) {
			if (list.get(leftIndex) <= list.get(rightIndex)) {
				temp.add(list.get(leftIndex));
				leftIndex++;
			} else {
				temp.add(list.get(rightIndex));
				rightIndex++;
			}
		}
		while (leftIndex <= middle) {
			temp.add(list.get(leftIndex));
			leftIndex++;
		}
		while (rightIndex <= high) {
			temp.add(list.get(rightIndex));
			rightIndex++;
		}

		int i = 0;
		int j = low;
		while (i < temp.size()) {
			list.set(j, temp.get(i++));
			j++;
		}
	}

}
