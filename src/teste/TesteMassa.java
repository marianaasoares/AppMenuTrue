package teste;

import dao.MassaDao;
import negocio.Massa;

public class TesteMassa {

	public static void main(String[] args) {
		
		Massa massa = new Massa("Nhoque ao sugo", 70);
		massa.setTipo("Massa de batatas");
		massa.setMassaFresca(true);
		massa.setQtdeMassa(300);
		
		MassaDao.incluir(massa);
		
		massa.show();
		
		for (Massa m : MassaDao.obterLista()) {
			m.show();
		}	

	}

}
