package negocio;

import java.util.ArrayList;
import java.util.List;
import auxiliar.Constante;
import modelo.Segmento;

public class Menu {
	private String nome;
	private String descricao;
	private int qtdeChefs;
	private Chef chef;
	private List<Segmento> segmentos = new ArrayList<Segmento>();
	private int [] qtdeSegmentos;
	
	
	public Menu() {
		segmentos = new ArrayList<Segmento>();
	}

	public Menu(String nome, String descricao) {
		this();
		this.nome = nome;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %d", 
				this.nome,
				this.descricao,
				this.qtdeChefs
				);
	}
	
	public void show() {
		if(this.validar()) {
			qtdeSegmentos = new int [Constante.SEGMENTOS.length];
			System.out.println("========== Menu ==========");
			//this.chef.show();
			System.out.println(toString());
			this.exibirSegmentos();
			for (Segmento segmento : this.segmentos) {
				segmento.show();	
			}	
			
			this.showContabiliza();
		}else {
			System.err.println("INV�LIDO!");
		}
		
	}	
	
	public void associa(Chef chef) {
		this.chef = chef;
	}
	
	public void adiciona(Segmento segmento) {
		this.getSegmentos().add(segmento);
	}
	
	public int getQtdeChefs() {
		return qtdeChefs;
	}

	public void setQtdeChefs(int qtdeChefs) {
		this.qtdeChefs = qtdeChefs;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Segmento> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(List<Segmento> segmentos) {
		this.segmentos = segmentos;
	}
	
	private boolean validar() {
		return this.segmentos.size() == Segmento.obterQtdedeSegmento();
	}
	private void contabiliza(Segmento segmento) {
		if(segmento instanceof Massa) {
			this.qtdeSegmentos[0]++;
			
		}else if(segmento instanceof Sobremesa) {
			this.qtdeSegmentos[1]++;
			
		}else if(segmento instanceof Saudaveis) {
			this.qtdeSegmentos[2]++;
		}		
	}
	
	private void exibirSegmentos() {
		System.out.println("Segmentos: ");
		
		for (Segmento s : this.segmentos) {
			this.contabiliza(s);
			
			s.show();
		}
	}
	
	private void showContabiliza() {
		System.out.println("Contabiliza: ");
		
		for (int i = 0; i < qtdeSegmentos.length; i++) {
			System.err.println("-" + Constante.SEGMENTOS[i] + ":"
					+ this.qtdeSegmentos[i]
					);
		}
	}
	

}


