package medical.m2i.controller.ville;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import medical.m2i.dao.VilleDao;
import medical.m2i.model.Ville;

/**
 * Servlet implementation class VilleServlet
 */
@WebServlet("/registerville")
public class VilleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private VilleDao villeDao;

	public void init() {
		villeDao = new VilleDao();
		
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VilleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Je suis bien dans la m�thode post");
		String nom = request.getParameter("nom");
		Integer code_postal = Integer.parseInt(request.getParameter("code_postal"));
		String pays = request.getParameter("pays");
		

		Ville ville = new Ville();
		ville.setNom(nom);
		ville.setCode_postal(code_postal);
		ville.setPays(pays);
		
		try {
			villeDao.registerVille(ville);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		response.sendRedirect(request.getContextPath() + "/ListVilleServlet");
	}

}