package logic;

import java.util.ArrayList;

public class SumMultiples {
	public ArrayList<Integer> multiples = new ArrayList<Integer>();

	public static boolean isMultipleOf(int i) {
		boolean multipleOf = false;
		
		if (i%3 == 0 || i%5 == 0) {
			multipleOf = true;
		}
		return multipleOf;
	}

	public static ArrayList<Integer> listOfMultiples(int i, ArrayList<Integer> multiples) {
		if (isMultipleOf(i)) {
			multiples.add(i);
		}
		return multiples;
	}

	public static int sumOfElementsInList(ArrayList<Integer> listToSum) {
		int sumOfElements = 0;
		for (int i = 0; i < listToSum.size(); i++) {
			sumOfElements = sumOfElements + listToSum.get(i);
		}
		return sumOfElements;
	}
}
