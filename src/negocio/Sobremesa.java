package negocio;

import modelo.Segmento;

public class Sobremesa extends Segmento {
	private boolean temChocolate;
	private int qtdeServe;
	private boolean gelado;
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s - %d ", 
				super.toString(),
				this.obterChocolate(),
				this.obterGelado(),
				this.qtdeServe
				);
	}

	public Sobremesa(String nomeReceita, int tempoMinutos) {
		super(nomeReceita, tempoMinutos);
		qtdeSegmentos++;
	}
	
	public Sobremesa(int id, String nomeReceita, int tempoMinutos, boolean temChocolate, int qtdeServe, boolean gelado) {
		super(id, nomeReceita, tempoMinutos);
		this.setTemChocolate(temChocolate);
		this.setQtdeServe(qtdeServe);
		this.setGelado(gelado);
	}
	

	public void show() {
		System.out.println("========== Sobremesa ==========");
		super.show();
		System.out.println(this.toString());

	}
	public int getQtdeServe() {
		return qtdeServe;
	}

	public void setQtdeServe(int qtdeServe) {
		this.qtdeServe = qtdeServe;
	}
	
	public boolean getTemChocolate() {
		return temChocolate;
	}
	public void setTemChocolate(boolean temChocolate) {
		this.temChocolate = temChocolate;
	}
	public boolean getGelado() {
		return gelado;
	}

	public void setGelado(boolean gelado) {
		this.gelado = gelado;
	}
	
	private String obterGelado() {
		return getGelado() ? "Sim" : "Não";
	}
	
	private String obterChocolate() {
		return getTemChocolate() ? "Sim" : "N�o";
	}
}
