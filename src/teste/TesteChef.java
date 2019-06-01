package teste;

import dao.ChefDao;
import negocio.Chef;

public class TesteChef {

	public static void main(String[] args) {

		Chef chef = new Chef("Maria Clï¿½udia","maria_claudia@hotmail.com","Claudia Maria", true );
		
		ChefDao.incluir(chef);
		
		chef.show();
		
		for (Chef p : ChefDao.obterLista()) {
			p.show();
		}
		
		if(ChefDao.excluir(1)) {
			System.out.println("Exclusão com sucesso!");
		} else {
			System.err.println("Erro na inclusão!");
		}

	}

}
