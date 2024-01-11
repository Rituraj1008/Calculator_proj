package Cal_servlt;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class cal_srlvlt
 */
public class cal_srlvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cal_srlvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String val1 = request.getParameter("vall1");
		String val2 = request.getParameter("vall2");
		String commd = request.getParameter("button");
		int ans = 0;
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		if(commd.equals("1")) {
			ans = a+b;
		}else if(commd.equals("2")) {
			ans = a-b;
		}else if(commd.equals("3")) {
			ans = a*b;
		}
		Integer.toString(ans);
		//response.getWriter().append("your result is:"+ans);
		response.sendRedirect("result.jsp?ans="+ans);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
