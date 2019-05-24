package modelo;


public abstract class Segmento {
	private int id; 
	private String nomeReceita;
	private int tempoMinutos;
	private int qtdeReceitas;
	private String contato;
	private int qtdeUsuarios;
	protected static int qtdeSegmentos;
	
	public Segmento(int id) {
		this.setId(id);
	}
	
	public Segmento(String nomeReceita, int tempoMinutos) {
		this.nomeReceita = nomeReceita;
		this.tempoMinutos = tempoMinutos;
	}
	
	public Segmento(int id, String nomeReceita, int tempoMinutos) {
		this(nomeReceita, tempoMinutos);
		this.setId(id);
		
	}
	
	@Override
	public String toString() {
		return String.format("%s - %d - %d - %d - %s", 
				this.nomeReceita,
				this.tempoMinutos,
				this.qtdeReceitas,
				this.qtdeUsuarios,
				this.contato
				);
	}
	
	public void show() {
		System.out.println("Segmento");
	}
	public String getNomeReceita() {
		return nomeReceita;
	}

	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	public int getTempoMinutos() {
		return tempoMinutos;
	}

	public void setTempoMinutos(int tempoMinutos) {
		this.tempoMinutos = tempoMinutos;
	}

	public int getQtdeReceitas() {
		return qtdeReceitas;
	}

	public void setQtdeReceitas(int qtdeReceitas) {
		this.qtdeReceitas = qtdeReceitas;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getQtdeUsuarios() {
		return qtdeUsuarios;
	}

	public void setQtdeUsuarios(int qtdeUsuarios) {
		this.qtdeUsuarios = qtdeUsuarios;
	}

	public static int obterQtdedeSegmento() {
		return qtdeSegmentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
