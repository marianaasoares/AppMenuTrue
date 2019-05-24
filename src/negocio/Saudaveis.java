package negocio;

import modelo.Segmento;

public class Saudaveis extends Segmento {
	private boolean vegetariana;
	private boolean vegana;
	private String tipo;
	private int serve;
	
	public Saudaveis(String nomeReceita, int tempoMinutos) {
		super(nomeReceita, tempoMinutos);
		qtdeSegmentos++;
	}
	public Saudaveis(int id, String nomeReceita, int tempoMinutos, boolean vegetariana, boolean vegana, String tipo, int serve) {
		super(id, nomeReceita, tempoMinutos);
		this.setVegetariana(vegetariana);
		this.setVegana(vegana);
		this.setTipo(tipo);
		this.setServe(serve);
	}
	
	@Override
	public String toString() {
		return String.format("- %s - %s - %s - %s - %d",
				super.toString(),
				this.obterVegano(),
				this.obterVegetariano(),
				this.tipo,
				this.serve
				);
	}
	
	public void show() {
		System.out.println("========== Saudáveis ==========");
		super.show();
		System.out.println(toString());
	}
	
	public boolean isVegetariana() {
		return vegetariana;
	}


	public void setVegetariana(boolean vegetariana) {
		this.vegetariana = vegetariana;
	}


	public boolean isVegana() {
		return vegana;
	}


	public void setVegana(boolean vegana) {
		this.vegana = vegana;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getServe() {
		return serve;
	}


	public void setServe(int serve) {
		this.serve = serve;
	}

	private String obterVegano() {
		return isVegana() ? "Sim" : "Não";
	}
	
	private String obterVegetariano() {
		return isVegetariana() ? "Sim" : "Não";
	}
	
}
