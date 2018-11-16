package codeChallenge.binaryGap;

/**
 * Problem Statement
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in 
 * the binary representation of N.
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. 
 * The number 15 has binary representation 1111 and has no binary gaps. 
 * The number 32 has binary representation 100000 and has no binary gaps.
 * 
 * Write a function: that, given a positive integer N, returns the length of its longest binary gap. 
 * The function should return 0 if N doesn't contain a binary gap.
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so 
 * its longest binary gap is of length 5. 
 * Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 * Write an efficient algorithm for the following assumptions
 * N is an integer within the range [1..2,147,483,647].
 **/

/**
 * Class: BinaryGapDecoder Author: Gautam Date: 15.11.2018 Purpose: Converts
 * integer into binary form. Calculates the length of longest binary gap and
 * returns it in the form of integer.
 **/

public class BinaryGapDecoder {

	/**
	 * MethodName: getLongestBinaryGap 
	 * Returns the length of longest binary gap present in an integer by converting the integer to a binary string and
	 * Calculating the gap
	 **/
	public int getLongestBinaryGap(int N) {
		// Convert integer to binary form
		String binaryIntegerStr = Integer.toBinaryString(N);

		int longestGap = 0;
		StringBuilder binaryIntegerBuilder = new StringBuilder(binaryIntegerStr);
		int strLength = binaryIntegerBuilder.length();

		// Get the first occurrence of integer 1 in the binary format.
		int currentIndex = binaryIntegerBuilder.indexOf("1");

		// If 1 is not present in binary format, then longest gap is zero
		if (currentIndex != -1) {
			// Iterate through the string to identify the longest binary gap
			for (int i = 0; i < strLength; i++) {
				// Get the next occurrence of 1 in the binary format.
				int nextIndex = binaryIntegerBuilder.indexOf("1", currentIndex + 1);

				if (nextIndex != -1) {
					// Check the difference and calculate the number of zeros between two 1's.
					int difference = nextIndex - currentIndex - 1;

					longestGap = (longestGap > difference) ? longestGap : difference;
					i = nextIndex;
					currentIndex = nextIndex;
				} else {
					break;
				}
			}
		}

		return longestGap;
	}
}