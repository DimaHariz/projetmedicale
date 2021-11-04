package medical.m2i.controller.ville;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import medical.m2i.dao.VilleDao;
import medical.m2i.model.Ville;

/**
 * Servlet implementation class ListVilleServlet
 */
@WebServlet("/ListVilleServlet")
public class ListVilleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListVilleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		VilleDao villeDao = new VilleDao();
		System.out.println( "ok dans getr patient" );
		try {
			List<Ville> vl = villeDao.getVilles(); 
			System.out.println( "vl size" + vl.size() );
			request.setAttribute("vl", vl); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listeville.jsp");
		dispatcher.forward(request, response);
	}
}
