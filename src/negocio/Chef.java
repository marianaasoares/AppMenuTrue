package negocio;

public class Chef {
	private int id;
	private String nome;
	private String email;
	private String usuario;
	private boolean amador;
	
	
	public Chef(String nome, String email, String usuario, boolean amador) {
		this.nome = nome;
		this.email = email;
		this.usuario = usuario;
		this.amador = amador;
	}
	
	public Chef (int id, String nome, String email, String usuario, boolean amador) {
		this(nome, email, usuario, amador);
		this.setId(id); 
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return String.format("%s - %s - %s - %s",
				this.nome,
				this.email,
				this.usuario,
				this.obterAmador()
				);
	}
	
	public void show() {
		System.out.println("========== Chef ==========");
		System.out.println(this.toString());
	}

	private String obterAmador() {
		return this.amador ? "Amador" : "Profissional";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public boolean isAmador() {
		return amador;
	}

	public void setAmador(boolean amador) {
		this.amador = amador;
	}
	
	
}