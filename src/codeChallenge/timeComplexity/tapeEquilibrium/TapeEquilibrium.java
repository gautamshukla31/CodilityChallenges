package codeChallenge.timeComplexity.tapeEquilibrium;

import java.util.Arrays;

/**
 * Class: TapeEquilibrium
 * @author Gautam Shukla
 * Date: 20.11.2018
 * Purpose: Given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 */
public class TapeEquilibrium {
	
	/**
	 * Given non-empty array , calculates and returns the minimal difference that can be achieved
	 * @param arrInteger - non-empty array A of N integers
	 * @return minimal difference
	 */
	public int getMinimalDifference(int[] arrInteger) {
        
        int length = arrInteger.length;
        int firstPartTotal = 0;
        int secondPartTotal = Arrays.stream(arrInteger).sum();
        int minimalDifference = Integer.MAX_VALUE;
        
        for(int i = 0; i < length-1; i++)
        {
            firstPartTotal += arrInteger[i];
            secondPartTotal -= arrInteger[i];
            int difference = Math.abs(firstPartTotal - secondPartTotal);
            if (minimalDifference > difference)
            {
                minimalDifference = difference;
            }
        }
        return minimalDifference;
    }

}
