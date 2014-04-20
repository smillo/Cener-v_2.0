package General;

public class Fatture {

	String numero, data;
	double totale;

	public Fatture(String numero, String data, double totale) {

		this.numero = numero;
		this.data = data;
		this.totale = totale;
	}

	public String getNumero() {
		return numero;
	}

	public String getData() {
		return data;
	}

	public double getTotale() {
		return totale;
	}
}
