package com.qa.portfolio;

public class SuperBlock {

	/**
	 * Return the largest length of consecutively repeating characters, do not
	 * ignore case
	 * 
	 * @param input
	 * @return the largest number of consecutive characters
	 */
	public int superBlock(String input) {

		if (input.isEmpty()) {
			return 0;
		}
		int longest = 0;
		int length = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				++length;
				if (length > longest) {
					longest = length;
				}
			} else {
				length = 1;
			}
		}
		if (length > longest) {
			longest = length;
		}
		return longest;
	}
}
