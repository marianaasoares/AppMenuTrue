package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChefDao;
import negocio.Chef;



public class ChefController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ChefController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("lista", ChefDao.obterLista());
		request.getRequestDispatcher("chefLista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Chef chef = new Chef();
		chef.setNome(request.getParameter("nome"));
		chef.setUsuario(request.getParameter("email"));
		chef.setEmail(request.getParameter("email"));
		chef.setAmador(Boolean.parseBoolean(request.getParameter("amador")));

		ChefDao.incluir(chef);
		
		request.setAttribute("titulo", "Chef");
		request.setAttribute("mensagem", chef.toString());
		request.setAttribute("controller", "ChefController");
		request.getRequestDispatcher("finaliza.jsp").forward(request, response);
	}

}
