package teste;

import dao.SaudaveisDao;
import negocio.Saudaveis;

public class TesteSaudaveis {

	public static void main(String[] args) {
		Saudaveis saudaveis = new Saudaveis("Omelete de claras", 5);
		saudaveis.setTipo("Café da manhã");
		saudaveis.setServe(1);
		saudaveis.setVegana(false);
		saudaveis.setVegetariana(true);
		
		SaudaveisDao.incluir(saudaveis);
		
		saudaveis.show();
		
		for (Saudaveis s : SaudaveisDao.obterLista()) {
			s.show();
		}	
		
		if(SaudaveisDao.excluir(1)) {
			System.out.println("Exclusão com sucesso!");
		} else {
			System.err.println("Erro na inclusão!");
		}

	}

}
