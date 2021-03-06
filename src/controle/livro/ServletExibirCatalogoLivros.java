package controle.livro;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.LivroDAO;
import modelo.dominio.Cliente;
import modelo.dominio.Livro;

/**
 * Servlet implementation class ServletExibirCatalogo
 */
@WebServlet("/exibirCatalogo")
public class ServletExibirCatalogoLivros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExibirCatalogoLivros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LivroDAO dao = new LivroDAO();
		HttpSession session = request.getSession(true);
        Cliente cliente = (Cliente) session.getAttribute("usuario");
		
		List<Livro> lista = dao.lerTodos();
		request.setAttribute("lista", lista);
		request.setAttribute("cliente", cliente);

		request.getRequestDispatcher("livro/catalogo-livros.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
