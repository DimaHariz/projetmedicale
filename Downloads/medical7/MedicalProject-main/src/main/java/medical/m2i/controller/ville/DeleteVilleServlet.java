package medical.m2i.controller.ville;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import medical.m2i.dao.VilleDao;

/**
 * Servlet implementation class DeleteVilleServlet
 */
@WebServlet("/deleteville")
public class DeleteVilleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteVilleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		//delete?id=valeur
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		VilleDao villeDao = new VilleDao();
		System.out.println( "ok dans supprimer ville" );
		villeDao.deleteVille( id );
		
		response.sendRedirect(request.getContextPath() + "/ListVilleServlet");
		
	}

}
