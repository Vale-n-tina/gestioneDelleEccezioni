package es2;

import java.util.Scanner;

public class esercizio2 {
	  public static void insertDati(){
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Quanti chilometri hai percorso?");
		  double km=scanner.nextInt();
		  System.out.println("quanta benzina hai messo?");
		  double litri= scanner.nextInt();
		  calcoloConsume(km,litri);
	  }
	  public static void calcoloConsume(double km, double litri){
		try{
			if(litri==0){
				throw new ArithmeticException("non è possibile inserire zero");
			}
			double consumo = km / litri;
			System.out.println("Il consumo è: " + consumo + " km/litro");
		}catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	  }
}
