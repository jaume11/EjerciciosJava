package com.java.exercise.ejerciciosbasicos1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroDivisibleEntreDos {

	public static void main(String[] args) throws InputMismatchException {
		/*
		 * 6) Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si
		 * no lo es, tambi�n debemos indicarlo.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero para saber si es divisible por 2:");

		// capturamos los errores con try catch en caso de no introducir caracteres numericos
		try {
			double numero = sc.nextDouble();

			// para calcular el resto de una division en java, se utiliza %
			if (numero % 2 == 0) {

				System.out.println("El n�mero: " + numero + " es divisible entre 2.");

			} else {
				System.out.println("El n�mero: " + numero + " no es divisible entre 2.");
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}

		System.out.println("Fin");
	}
}
