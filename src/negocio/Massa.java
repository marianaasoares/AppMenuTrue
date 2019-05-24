package negocio;

import modelo.Segmento;

public class Massa extends Segmento{

	private String tipo;
	private boolean massaFresca;
	private int qtdeMassa;
	
	
	@Override
	public String toString() {
	
		 return String.format("%s - %s - %s - %s", 
				super.toString(),
				this.tipo,
				this.obterMassaFresca(),
				this.qtdeMassa
				);
	}
	
	
	public Massa(String nomeReceita, int tempoMinutos) {
		super(nomeReceita, tempoMinutos);
		qtdeSegmentos++;
	}
	
	public Massa(int id, String nomeReceita, int tempoMinutos, String tipo, boolean massaFresca, int qtdeMassa) {
		super(id, nomeReceita, tempoMinutos);
		this.setTipo(tipo);
		this.setMassaFresca(massaFresca);
		this.setQtdeMassa(qtdeMassa);
	}
	public void show() {
		System.out.println("======== Massa ========");
		super.show();
		System.out.println(this.toString());
		
	}
	
	public boolean getMassaFresca() {
		return massaFresca;
	}

	public void setMassaFresca(boolean massaFresca) {
		this.massaFresca = massaFresca;
	}

	public int getQtdeMassa() {
		return qtdeMassa;
	}

	public void setQtdeMassa(int qtdeMassa) {
		this.qtdeMassa = qtdeMassa;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	private String obterMassaFresca() {
		return getMassaFresca() ? "Sim" : "Não";
	}
}