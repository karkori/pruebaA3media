package com.i3tv.test;

import com.sun.tools.javac.util.StringUtils;

import java.util.Locale;

public class Palimdrome {
	
	public static void main(String[] args) {
	}

	/**
	 * Este método debe devolver true en caso de que la cadena recibida sea
	 * palíndroma. Devolverá false en cualquier otro caso.
	 * Dispones de un test para validar el resultado.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {
		/*
		 * Definición Un palíndromo es una palabra, número o frase que se lee
		 * igual hacia adelante que hacia atrás. Ejemplos de palíndromos:
		 * "a esa paloma ese amo la pasea" "arenera"
		 */
		boolean isPalindrome = false;
		String sReverse = new StringBuilder(s).reverse().toString().toLowerCase();
		s = s.toLowerCase();
		int slength = s.length()/2;
		for (int i = 0; i < slength; i++) {
			isPalindrome = s.charAt(i) == sReverse.charAt(i);
		}
		return isPalindrome;
	}
}
