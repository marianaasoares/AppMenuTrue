package teste;

import negocio.Chef;
import negocio.Massa;
import negocio.Menu;
import negocio.Saudaveis;
import negocio.Sobremesa;

public class TesteMenu {

	public static void main(String[] args) {
		
		Massa massa = new Massa("Nhoque ao sugo", 70);
		massa.setTipo("Massa de batatas");
		massa.setMassaFresca(true);
		massa.setQtdeMassa(300);
		
		Sobremesa sobremesa = new Sobremesa("Mousse de limÃ£o", 30);
		sobremesa.setTemChocolate(false);
		sobremesa.setGelado(true);
		sobremesa.setQtdeServe(10);
		
		Saudaveis saudaveis = new Saudaveis("Omelete de claras", 1); 
		saudaveis.setTipo("Café da manhã");
		saudaveis.setServe(1);
		saudaveis.setVegana(false);
		saudaveis.setVegetariana(true);	
		
		
		Chef chef = new Chef("Maria Clï¿½udia","maria_claudia@hotmail.com","Claudia Maria", true );

		
		Menu menu = new Menu("Chef's House", "A plataforma onde todos sÃ£o chefs!");
		menu.setQtdeChefs(10000);
		menu.adiciona(massa);
		menu.adiciona(sobremesa);
		menu.adiciona(saudaveis);
		menu.show();

	}
}