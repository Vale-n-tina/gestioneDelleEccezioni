package es3;

public class ContoCorrente {
	private String titolare;
	private int nMovimenti;
	private final int maxMovimenti = 50;
	private double saldo;

	public ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		this.nMovimenti = 0;
	}


	public void preleva(double x) throws BancaException {
		if (nMovimenti < maxMovimenti) {
			saldo = saldo - x;
		} else {
			saldo = saldo - x - 0.50;
		}
		if(saldo < 0){
			throw new BancaException("il conto è in rosso");
		}
		nMovimenti++;
	}

	public double restituisciSaldo(){
		return this.saldo;
	}

	public String getTitolare() {
		return this.titolare;
	}

	public int getnMovimenti() {
		return nMovimenti;
	}

	public int getMaxMovimenti() {
		return maxMovimenti;
	}

	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "ContoCorrente{" +
				  "titolare='" + titolare + '\'' +
				  ", nMovimenti=" + nMovimenti +
				  ", maxMovimenti=" + maxMovimenti +
				  ", saldo=" + saldo +
				  '}';
	}
}
