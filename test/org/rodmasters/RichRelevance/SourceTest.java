package org.rodmasters.RichRelevance;

import java.util.Arrays;

import junit.framework.TestCase;


public class SourceTest extends TestCase
{

	public void testIsAnagramOfPalindrome()
	{
		Source testSource = new Source();
		String pass1 = "imanamregalagermanami";
		String fail1 = "banana";
		String pass2 = "racecra";
		assertEquals( 1, testSource.isAnagramOfPalindrome( pass1 ) );
		assertEquals( 0, testSource.isAnagramOfPalindrome( fail1 ) );
		assertEquals( 1, testSource.isAnagramOfPalindrome( pass2 ) );
	}


	public void testCountChars()
	{
		Source testSource = new Source();
		String testStringAZ = "";
		String testStringZA = "";
		int[] testCountAZ = new int[Source.LOWERCASE_ALPHABET];
		int[] testCountZA = new int[Source.LOWERCASE_ALPHABET];
		for ( int i = 0; i < 26; i++ )
		{
			testCountAZ[i] = i + 1;
			testCountZA[Source.LOWERCASE_ALPHABET - 1 - i] = i + 1;
			for ( int j = 0; j < i + 1; j++ )
			{
				testStringAZ = testStringAZ + String.valueOf( (char) ( 'a' + i ) );
				testStringZA = testStringZA + String.valueOf( (char) ( 'z' - i ) );
			}
		}
		int[] resultCountAZ = testSource.countChars( testStringAZ );
		int[] resultCountZA = testSource.countChars( testStringZA );
		assertTrue( Arrays.equals( testCountAZ, resultCountAZ ) );
		assertTrue( Arrays.equals( testCountZA, resultCountZA ) );
	}

}
