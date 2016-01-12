package org.abhinaya.marsroverservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abhinaya.marsrover.MarsRover;

/**
 * Servlet implementation class MarsRoverController
 */
@WebServlet("/MarsRoverController")
public class MarsRoverController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		char command = request.getParameter("command").charAt(0);
		HttpSession session = request.getSession();
		MarsRover rover = (MarsRover)session.getAttribute("rover");
		rover.parse(command);
		session.setAttribute("rover",rover);
		response.setContentType("text/html");
		if(rover.isValidPosition() == true)
		{
			response.sendRedirect("RemoteControl.jsp");
		}
		else
		{
			PrintWriter writer = response.getWriter();
			writer.println("Invaliad Move");
		}
	}

}
