package org.abhinaya.marsroverservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abhinaya.marsrover.Area;
import org.abhinaya.marsrover.MarsRover;

/**
 * Servlet implementation class MarsRoverInitialize
 */
@WebServlet("/MarsRoverInitialize")
public class MarsRoverInitialize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarsRoverInitialize() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int initialx = Integer.parseInt(request.getParameter("initialx"));
		int initialy = Integer.parseInt(request.getParameter("initialy"));
		char direction = request.getParameter("direction").charAt(0);
		int x = Integer.parseInt(request.getParameter("area_x"));
		int y = Integer.parseInt(request.getParameter("area_y"));
		Area area = new Area();
		area.set(x,y);
		HttpSession session = request.getSession();
		MarsRover rover = new MarsRover(initialx,initialy,direction,area);
		session.setAttribute("rover", rover);
		System.out.println("Successfully initialized");
		response.sendRedirect("RemoteControl.jsp");
	}

}
