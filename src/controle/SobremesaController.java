package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SobremesaDao;
import negocio.Sobremesa;

public class SobremesaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SobremesaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("lista", SobremesaDao.obterLista());
		request.getRequestDispatcher("sobremesaLista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Sobremesa sobremesa = new Sobremesa(request.getParameter("nomeReceita"), 
				Integer.valueOf(request.getParameter("tempoMinutos")));
		
		sobremesa.setTemChocolate(Boolean.parseBoolean(request.getParameter("temChocolate")));
		sobremesa.setGelado(Boolean.parseBoolean(request.getParameter("gelado")));
		sobremesa.setQtdeServe(Integer.valueOf(request.getParameter("qtdeServe")));

		SobremesaDao.incluir(sobremesa);
		
		request.setAttribute("titulo", "Sobremesa");
		request.setAttribute("mensagem", sobremesa.toString());
		request.setAttribute("controller", "SobremesaController");
		request.getRequestDispatcher("finaliza.jsp").forward(request, response);
	}

}
