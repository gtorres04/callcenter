/**
 * 
 */
package com.gtorres.test.callcenter.util;

import java.util.Random;

/**
 * @author gtorresoft
 *
 */
public class Utility {
	public static final int RANGO_ALEATORIO_DESDE = 5;
	public static final int RANGO_ALEATORIO_HASTA = 10;
	private Utility() {
	}

	/**
	 * Tiempo de ocupacion del empleado
	 * 
	 * @param segundos
	 *            tiempo en segundos
	 */
	public static void timeOutOfEmployee(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt(); 
		}
	}

	/**
	 * Generar un numero aleatoria a partir de un rango.
	 * 
	 * @param desde
	 *            desde que numero
	 * @param hasta
	 *            hasta que numero
	 * @return
	 */
	public static int randomNumber(int desde, int hasta) {
		Random rnd = new Random();
		return rnd.nextInt((hasta - desde) + 1) + desde;
	}
}
