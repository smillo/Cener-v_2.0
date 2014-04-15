package General;

public class Cliente {
	
	String nome,nome2, indirizzo, città, cap, piva, descrizione,descrizione2;
	double importo,importo2, imponibile, iva, imposta, tot_fattura, ritenuta, tot_dovuto;
	boolean gennaio,febbraio,marzo,aprile,maggio,giugno,luglio,agosto,settembre,ottobre,novembre,dicembre;
	public Cliente(String nome,String nome2,String indirizzo,String città,String cap,String piva,String descrizione,double importo,String descrizione2,double importo2,double imponibile,double iva,double imposta,double tot_fattura,double ritenuta,double tot_dovuto,boolean gennaio,boolean febbraio,boolean marzo,boolean aprile,boolean maggio,boolean giugno,boolean luglio,boolean agosto,boolean settembre,boolean ottobre,boolean novembre,boolean dicembre){
		
		this.nome = nome;
		this.nome2 = nome2;
		this.indirizzo = indirizzo;
		this.città = città;
		this.cap = cap;
		this.piva = piva;
		this.descrizione = descrizione;
		this.importo = importo;
		this.descrizione2 = descrizione2;
		this.importo2 = importo2;
		this.imponibile = imponibile;
		this.iva = iva;
		this.imposta = imposta;
		this.tot_fattura = tot_fattura;
		this.ritenuta = ritenuta;
		this.tot_dovuto = tot_dovuto;
		this.gennaio = gennaio;
		this.febbraio = febbraio;
		this.marzo = marzo;
		this.aprile = aprile;
		this.maggio= maggio;
		this.giugno = giugno;
		this.luglio = luglio;
		this.agosto = agosto;
		this.settembre = settembre;
		this.ottobre = ottobre;
		this.novembre = novembre;
		this.dicembre =dicembre;
	}

	public boolean isGennaio() {
		return gennaio;
	}

	public boolean isFebbraio() {
		return febbraio;
	}

	public boolean isMarzo() {
		return marzo;
	}

	public boolean isAprile() {
		return aprile;
	}

	public boolean isMaggio() {
		return maggio;
	}

	public boolean isGiugno() {
		return giugno;
	}

	public boolean isLuglio() {
		return luglio;
	}

	public boolean isAgosto() {
		return agosto;
	}

	public boolean isSettembre() {
		return settembre;
	}

	public boolean isOttobre() {
		return ottobre;
	}

	public boolean isNovembre() {
		return novembre;
	}

	public boolean isDicembre() {
		return dicembre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizione2() {
		return descrizione2;
	}

	public void setDescrizione2(String descrizione2) {
		this.descrizione2 = descrizione2;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public double getImporto2() {
		return importo2;
	}

	public void setImporto2(double importo2) {
		this.importo2 = importo2;
	}

	public double getImponibile() {
		return imponibile;
	}

	public void setImponibile(double imponibile) {
		this.imponibile = imponibile;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getImposta() {
		return imposta;
	}

	public void setImposta(double imposta) {
		this.imposta = imposta;
	}

	public double getTot_fattura() {
		return tot_fattura;
	}

	public void setTot_fattura(double tot_fattura) {
		this.tot_fattura = tot_fattura;
	}

	public double getRitenuta() {
		return ritenuta;
	}

	public void setRitenuta(double ritenuta) {
		this.ritenuta = ritenuta;
	}

	public double getTot_dovuto() {
		return tot_dovuto;
	}

	public void setTot_dovuto(double tot_dovuto) {
		this.tot_dovuto = tot_dovuto;
	}

}
