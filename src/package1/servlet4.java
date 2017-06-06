package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet4
 */
@WebServlet("/servlet4")
public class servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		players p = new players();
		
		p.playerId = Integer.parseInt(request.getParameter("PId"));
		p.goals = 0;
		p.assists = 0;
		p.age = 0;
		p.team = null;
		p.yellowCards = 0;
		p.redCards = 0;
		
	  	
	  	if(p.playerId==0) {
	  		response.sendRedirect("editPlayer.jsp");
	  		System.out.println("Player Id required");
	  	}
	  	else{
	  		String check = request.getParameter("goalsEdit");
			if(!check.isEmpty())
				p.goals = Integer.parseInt(check);
			
			check = request.getParameter("assistsEdit");
			if(!check.isEmpty())
				p.assists = Integer.parseInt(check);
			
			check = request.getParameter("ageEdit");
			if(!check.isEmpty())
				p.age = Integer.parseInt(check);
			
			check = request.getParameter("yellowEdit");
			if(!check.isEmpty())
				p.yellowCards = Integer.parseInt(check);
			
			check = request.getParameter("redEdit");
			if(!check.isEmpty())
				p.redCards = Integer.parseInt(check);
			
			check = request.getParameter("teamEdit");
			if(!check.isEmpty())
				p.team = check;
	  		players.editInDatabase(p);
	  	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
