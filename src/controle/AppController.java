package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChefDao;
import dao.MassaDao;
import dao.SaudaveisDao;
import dao.SobremesaDao;


public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String tela;
	
    public AppController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		tela = request.getParameter("tela").toLowerCase()+"Detalhe.jsp";
		
		request.getRequestDispatcher(tela).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		tela = request.getParameter("tela").toLowerCase()+"Lista.jsp";
		
		request.setAttribute("lista", this.obterLista());
		
		request.getRequestDispatcher(tela).forward(request, response);
	}

	private List<?> obterLista(){
		switch (tela) {
		case "chefLista.jsp":
			return ChefDao.obterLista();
			
		case "massaLista.jsp":
			return MassaDao.obterLista();
			
		case "saudaveisLista.jsp":
			return SaudaveisDao.obterLista();
			
		case "sobremesaLista.jsp":
			return SobremesaDao.obterLista();
			
		}
		
		return null; 
	}

}
