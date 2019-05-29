package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MassaDao;
import negocio.Massa;


public class MassaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MassaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("lista", MassaDao.obterLista());
		request.getRequestDispatcher("massaLista.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Massa massa = new Massa(request.getParameter("nomeReceita"), Integer.valueOf(request.getParameter("tempoMinutos")));
		massa.setTipo(request.getParameter("tipo"));
		massa.setMassaFresca(Boolean.parseBoolean(request.getParameter("massaFresca")));
		massa.setQtdeMassa(Integer.parseInt(request.getParameter("qtdeMassa")));

		MassaDao.incluir(massa);
		
		request.setAttribute("titulo", "Massa");
		request.setAttribute("mensagem", massa.toString());
		request.getRequestDispatcher("finaliza.jsp").forward(request, response);
	}

}
