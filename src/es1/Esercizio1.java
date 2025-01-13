package es1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

	public static void eseguiEsercizio() {
		int[] array = new int[5];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		stampaArray(array);
		insertNumber(array);
		stampaArray(array);
	}

	public static void stampaArray(int[] array) {

		System.out.println(Arrays.toString(array));

	}

	public static void insertNumber(int[] array) {
		int risposta;
		do {
			Scanner scanner = new Scanner(System.in);

			System.out.println("scegli un numer0 a piacimento");
			int numero = scanner.nextInt();
			System.out.println("a che posizione vuoi inserirlo dell'array?");
			int posizione = scanner.nextInt();

			if (posizione < 0 || posizione >= array.length) {
				throw new RuntimeException("Emily, posizione non valida; riprova");
			} else {
				array[posizione - 1] = numero;
			}
			System.out.println("Emily, per continuare inserisci un numero per continuare o 0 per vedere i risultati");
			risposta = scanner.nextInt();
			scanner.close();
		}

		while (risposta != 0);


	}
}

