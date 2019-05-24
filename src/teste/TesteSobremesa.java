package teste;

import negocio.Sobremesa;

public class TesteSobremesa {

	public static void main(String[] args) {
		
		Sobremesa sobremesa = new Sobremesa("Mousse de limão", 30);
		sobremesa.setTemChocolate(false);
		sobremesa.setGelado(true);
		sobremesa.setQtdeServe(15);
		sobremesa.show();
	}
}