package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.TimkiemWsStub;
import ws.TimkiemWsStub.Search;

/**
 * Servlet implementation class TimkiemController
 */
public class TimkiemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimkiemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String tenhs = request.getParameter("tenhs");
		TimkiemWsStub ts = new TimkiemWsStub();
		Search s = new Search();
		s.setTenhs(tenhs);
		request.setAttribute("dshs", ts.search(s).get_return());
		request.setAttribute("kq", ts.search(s).get_return().length);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
