package codeChallenge.timeComplexity.permMissingElement;

import java.util.Arrays;

class PermMissingElement {
	public int getMissingElement(int[] arrElements) {

		if (0 == arrElements.length) {
			return 1;
		}

		Arrays.sort(arrElements);
		boolean bIsMissingElement = false;
		int element = arrElements[0];
		int missingElement = 0;
		for (int n : arrElements) {
			if (n == element) {
				element++;
			} else {
				bIsMissingElement = true;
				missingElement = element;
			}
		}
		return (true == bIsMissingElement) ? missingElement
				: getMissingElementInSeries(arrElements[0], arrElements[arrElements.length - 1]);
	}

	public int getMissingElementInSeries(int firstElement, int LastElement) {
		if (firstElement != 1) {
			return firstElement - 1;
		} else {
			return LastElement + 1;
		}
	}
}