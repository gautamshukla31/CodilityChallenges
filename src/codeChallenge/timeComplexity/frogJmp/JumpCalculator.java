package codeChallenge.timeComplexity.frogJmp;

/**
 * Problem Statement: A small frog wants to get to the other side of the road. 
 * The frog is currently located at position X and wants to get to a position greater than or equal to Y. 
 * The small frog always jumps a fixed distance, D.
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * Write a function:
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 * 
 * For example, given:
 *   X = 10
 *   Y = 85
 *   D = 30
 *   the function should return 3, because the frog will be positioned as follows:
 *   after the first jump, at position 10 + 30 = 40
 *   after the second jump, at position 10 + 30 + 30 = 70
 *   after the third jump, at position 10 + 30 + 30 + 30 = 100
 *   
 *   Write an efficient algorithm for the following assumptions:
 *   X, Y and D are integers within the range [1..1,000,000,000];
 *   X = Y.
 **/

/**
 * Class: JumpCalculator 
 * Author: Gautam Shukla 
 * Date: 17.10.2018 
 * Purpose: Calculates and returns the minimal number of jumps from position X to a position equal to or greater than Y.
 **/
class JumpCalculator {
	
	/**
	 * Method Name: getNumberOfJumps 
	 * Purpose: Returns the number of jumps required to reach destination Y from destination X
	 * @param X
	 * @param Y
	 * @param D
	 * @return
	 */
	public int getNumberOfJumps(int X, int Y, int D) {

		if (X >= Y) {
			return 0;
		}
		int distanceToCover = Y - X;
		int noOfJumps = distanceToCover / D;
		int newPositionOfX = X + (noOfJumps * D);

		if (newPositionOfX < Y) {
			noOfJumps++;
		}
		
		return noOfJumps;
	}
}