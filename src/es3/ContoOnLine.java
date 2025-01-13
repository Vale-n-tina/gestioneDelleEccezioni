package es3;

public class ContoOnLine extends ContoCorrente {
	private double maxPrelievo;

	public ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	public void stampaSaldo() {
		System.out.println("titolare:" + titolare + "-saldo:" + saldo + "-Num movimenti:" + nMovimenti + "-Massimo movimenti" + maxMovimenti + "-Massimo prelievo possibile:" + maxPrelievo);
	}

	public void preleva(double x){
		if(x <= maxPrelievo){
			super.preleva(x);
		}
	}
}
