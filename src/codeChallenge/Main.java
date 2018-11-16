/**
 * 
 */
package codeChallenge;

import codeChallenge.binaryGap.BinaryGapDecoder;
/**
 * Class: Main
 * Author: Gautam Shukla
 * Purpose: Used to invoke code challenge algorithm solutions created
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java");
		BinaryGapDecoder decoder = new BinaryGapDecoder();
		System.out.println(decoder.getLongestBinaryGap(529));
	}
}
