package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SaudaveisDao;
import negocio.Saudaveis;

public class SaudaveisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SaudaveisController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("lista", SaudaveisDao.obterLista());
		request.getRequestDispatcher("saudaveisLista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Saudaveis s = new Saudaveis(request.getParameter("nomeReceita"), Integer.valueOf(request.getParameter("tempoMinutos")));
		
		s.setVegetariana(Boolean.parseBoolean(request.getParameter("vegetariana")));
		s.setVegana(Boolean.parseBoolean(request.getParameter("vegana")));
		s.setTipo(request.getParameter("tipo"));
		s.setServe(Integer.valueOf(request.getParameter("serve")));
		
		SaudaveisDao.incluir(s);
		
		request.setAttribute("titulo", "Chef");
		request.setAttribute("mensagem", s.toString());
		request.setAttribute("controller", "SaudaveisController");
		request.getRequestDispatcher("finaliza.jsp").forward(request, response);
	}

}
