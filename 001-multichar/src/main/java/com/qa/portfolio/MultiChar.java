package com.qa.portfolio;

public class MultiChar {

	/**
	 * For each character in the entered string the method will triplicate each the
	 * character and return the concatenated string.
	 * 
	 * @param input - any string
	 * @return triplicates of each letter from the input
	 */
	public String multiChar(String input) {
		int len = input.length();
		String newstring = "";
		for (int i = 0; i < len; i++) {
			newstring += input.substring(i, i + 1) + input.substring(i, i + 1) + input.substring(i, i + 1);
		}
		return newstring;
	}

}
