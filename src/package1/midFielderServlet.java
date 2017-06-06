package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class midFielderServlet
 */
@WebServlet("/midFielderServlet")
public class midFielderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public midFielderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Midfielder m = new Midfielder();
		m.name = request.getParameter("name");
		m.nationality = request.getParameter("nationality");
		m.age = Integer.parseInt(request.getParameter("age"));
		m.goals= Integer.parseInt(request.getParameter("goals"));
		m.assists = Integer.parseInt(request.getParameter("assists"));
		m.team = request.getParameter("team");
		m.passes = Integer.parseInt(request.getParameter("passes"));
		m.addMidfielder(m);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
