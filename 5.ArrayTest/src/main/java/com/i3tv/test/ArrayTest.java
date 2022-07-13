package com.i3tv.test;

public class ArrayTest {
	
	private static int[] test1 = {-3, 2, 3, 4}; // Resultado debe ser 2
	private static int[] test2 = {1, -1, 2, -5}; // Resultado debe ser 1
	private static int[] test3 = {3, -1, 2, -5}; // Resultado debe ser -1
	private static int[] test4 = {3, -1, 0, -5}; // Resultado debe ser 0
	
	public static void main(String[] args) {
		System.out.println("El más cercano a cero es: " + getClosestToZero(test1));
		System.out.println("El más cercano a cero es: " + getClosestToZero(test2));
		System.out.println("El más cercano a cero es: " + getClosestToZero(test3));
		System.out.println("El más cercano a cero es: " + getClosestToZero(test4));
	}

	/**
	 * Este método debe devolver el número más cercano a cero o el cero si existe. 
	 * En caso de econtrar números equidistantes, deberá devolver el positivo.
	 * @param values
	 * @return
	 */
	public static int getClosestToZero(int[] values) {
		int closetToZero = Integer.MAX_VALUE;

		for (int  i = 0; i < values.length; i++){
			if (values[i] == 0) {
				closetToZero = values[i];
			} else if (values[i] > 0 && values[i] <= Math.abs(closetToZero)) {
				closetToZero = values[i];
			} else if (values[i] < 0 && - values[i] < Math.abs(closetToZero)) {
				closetToZero = values[i];
			}
		}

		return closetToZero;
	}

}
