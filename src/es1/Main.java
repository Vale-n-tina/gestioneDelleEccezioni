package es1;


import es3.BancaException;
import es3.ContoCorrente;

import static es2.esercizio2.insertDati;

public class Main {
	public static void main(String[] args) {

		//Esercizio1.eseguiEsercizio();
		//insertDati();
		ContoCorrente conto1 = new ContoCorrente("valentina", 30000);
		System.out.println("saldo disponibile:" + conto1.restituisciSaldo());
		try {
			conto1.preleva(1200);
			System.out.println("saldo disponibile: + conto1.restituisciSaldo()");
		} catch (BancaException e) {
			System.out.println("errore durante il prelievo:" + e);

		}


	}


}