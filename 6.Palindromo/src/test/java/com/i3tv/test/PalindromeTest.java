package com.i3tv.test;

import junit.framework.TestCase;

import org.junit.Test;

public class PalindromeTest {

	/**
	 *  Completa las pruebas que le falten al test para validar todos los casos.
	 */
	@Test
	public void passed() {
		TestCase.assertTrue(!Palimdrome.isPalindrome("Hola Mundo"));
		TestCase.assertTrue(Palimdrome.isPalindrome("12321"));
		TestCase.assertTrue(!Palimdrome.isPalindrome("12345"));
		TestCase.assertTrue(Palimdrome.isPalindrome("abccba"));
		TestCase.assertTrue(Palimdrome.isPalindrome("abcba"));
	}

}
