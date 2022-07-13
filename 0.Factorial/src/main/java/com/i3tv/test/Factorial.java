package com.i3tv.test;

public class Factorial {

	/**
	 * Este método debe calcular y devolver el factorial de un número N
	 * @param n Número origen
	 * @return Factorial del número
	 */
	public static Integer getFactorial(Integer n) {
		return n <= 1? n: n * getFactorial(n - 1);
	}

}
