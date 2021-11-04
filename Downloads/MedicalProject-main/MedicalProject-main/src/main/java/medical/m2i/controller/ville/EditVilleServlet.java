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
 * Servlet implementation class EditVilleServlet
 */
@WebServlet("/editVille")
public class EditVilleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditVilleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    	int id = Integer.parseInt(request.getParameter("id"));

		VilleDao villeDao = new VilleDao();
		System.out.println("ok dans edit Ville");
		Ville v = villeDao.getVille(id);

		request.setAttribute("villeparam", v);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/villeedit.jsp");
		dispatcher.forward(request, response);

		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// R�cup�rer les infos soumises
		
		System.out.println("Je suis bien dans la m�thode post");
		String nom = request.getParameter("nom");
		Integer code_postal = Integer.parseInt(request.getParameter("code_postal"));
		String pays = request.getParameter("pays");
		
		int id = Integer.parseInt( request.getParameter("id") );
		
		// Mettre � jour le ville en question 
		VilleDao villeDao = new VilleDao();
		System.out.println( "ok dans edit ville " + id );
		villeDao.editVille( id , nom, code_postal, pays );
		
		response.sendRedirect(request.getContextPath() + "/ListVilleServlet");
		
	}


}
