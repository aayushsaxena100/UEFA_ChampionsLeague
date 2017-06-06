package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class defenderServlet
 */
@WebServlet("/defenderServlet")
public class defenderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public defenderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Defender d = new Defender();
		d.name = request.getParameter("name");
		d.nationality = request.getParameter("nationality");
		d.age = Integer.parseInt(request.getParameter("age"));
		d.goals= Integer.parseInt(request.getParameter("goals"));
		d.assists = Integer.parseInt(request.getParameter("assists"));
		d.team = request.getParameter("team");
		d.tackles = Integer.parseInt(request.getParameter("tackles"));
		d.interceptions=Integer.parseInt(request.getParameter("interceptions"));
		d.addDefender(d);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
