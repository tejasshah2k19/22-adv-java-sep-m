import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestHeaderServlet")
public class RequestHeaderServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// requestHeader
		// 15 final
		Enumeration<String> h = request.getHeaderNames(); // host accept referer encoding lang browser cookie

		// 0th index
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		while (h.hasMoreElements()) { // true    
			String name = h.nextElement();
			out.println(name+" => "+request.getHeader(name)+"<BR><BR>");
		}
	}
}
