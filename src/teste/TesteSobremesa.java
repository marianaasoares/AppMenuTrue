package teste;

import dao.SobremesaDao;
import negocio.Sobremesa;

public class TesteSobremesa {

	public static void main(String[] args) {
		
		Sobremesa sobremesa = new Sobremesa("Mousse de lim√£o", 30);
		sobremesa.setTemChocolate(false);
		sobremesa.setGelado(true);
		sobremesa.setQtdeServe(15);
		
		SobremesaDao.incluir(sobremesa);
		
		sobremesa.show();
		
		for (Sobremesa s : SobremesaDao.obterLista()) {
			s.show();
		}	
		
		if(SobremesaDao.excluir(1)) {
			System.out.println("Exclus„o com sucesso!");
		} else {
			System.err.println("Erro na inclus„o!");
		}

	}
}