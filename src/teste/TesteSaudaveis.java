package teste;

import negocio.Saudaveis;

public class TesteSaudaveis {

	public static void main(String[] args) {
		Saudaveis saudaveis = new Saudaveis("Omelete de claras", 5);
		saudaveis.setTipo("Caf� da manh�");
		saudaveis.setServe(1);
		saudaveis.setVegana(false);
		saudaveis.setVegetariana(true);
		saudaveis.show();
	}

}
