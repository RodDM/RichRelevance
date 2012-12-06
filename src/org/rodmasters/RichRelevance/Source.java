/*
 * @(#)Source.java
 * 
 * Copyright (c) 2012 Rod Masters
 * 
 */

package org.rodmasters.RichRelevance;

/**
 * Code test for RichRelevance. This class, as specified in the code test
 * provided by Mike Sherman is just a wrapper for the function
 * isAnagramOfPalindrome
 * 
 * @author Rod Masters
 * @version 12/6/2012
 */
public class Source
{
	/**
	 * Function that takes a string and returns whether or not it is an anagram
	 * of a palindrome.
	 * 
	 * @param S - a non-empty string of 100,000 or fewer lowercase alphabet
	 *        characters [a-z]
	 * @return 1 if the string is a possible anagram of a palindrome, 0
	 *         otherwise.
	 */
	public int isAnagramOfPalindrome( final String S )
	{
		int[] alphabet = countChars( S );
		int foundOdd = 0;
		for ( int i = 0; i < LOWERCASE_ALPHABET; i++ )
		{
			if ( alphabet[i] % 2 != 0 )
			{
				foundOdd++;
			}
			// a palindrome has at most 1 odd number of characters (middle
			// character, only if the palindrome is an odd length).
			if ( foundOdd > 1 )
			{
				return 0;
			}
		}
		return 1;
	}


	/**
	 * Count the number of occurrences of each character in the lowercase
	 * English alphabet for a non-empty string of lowercase letters.
	 * 
	 * @param S - a non-empty string of 100,000 or fewer lowercase alphabet
	 *        characters [a-z]
	 * @return an array with the number of occurrences of each character in
	 *         order with a at 0 and z at 25.
	 */
	public int[] countChars( final String S )
	{
		int[] alphaCount = new int[LOWERCASE_ALPHABET];
		for ( int i = 0; i < S.length(); i++ )
		{
			int x = S.charAt( i ) - 'a';
			alphaCount[x]++;
		}
		return alphaCount;
	}
	
	public static final int LOWERCASE_ALPHABET = 26;
}
