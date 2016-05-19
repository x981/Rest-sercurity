package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.HelloRestFul_Client;

/**
 * Servlet implementation class HelloRestFulController
 */
@WebServlet("/HelloRestFulController")
public class HelloRestFulController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloRestFulController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("text")) {
			HelloRestFul_Client hc = new HelloRestFul_Client();
			request.setAttribute("result", hc.text());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if(action.equalsIgnoreCase("html")) {
			HelloRestFul_Client hc = new HelloRestFul_Client();
			request.setAttribute("result1", hc.html());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("cothamso")) {
			String ten = request.getParameter("ten");
			HelloRestFul_Client hc = new HelloRestFul_Client();
			request.setAttribute("result2", hc.chao(ten));
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("tong2so")){
			int a = Integer.parseInt(request.getParameter("a"));
			int b = Integer.parseInt(request.getParameter("b"));
			
			HelloRestFul_Client hc = new HelloRestFul_Client();
			request.setAttribute("result3", hc.tong2so(a, b));
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
