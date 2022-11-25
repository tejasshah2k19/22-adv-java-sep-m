package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddBookFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("AddBookFilter::doFilter()");

		String bookName = request.getParameter("bookName");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		boolean isError = false;

		if (bookName == null || bookName.trim().length() == 0) {
			isError = true;
			request.setAttribute("bookNameError", "Please Enter BookName");
		}else {
			request.setAttribute("bookNameValue", bookName);
		}

		if (price == null || price.trim().length() == 0) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Price");
		}else {
			request.setAttribute("priceValue",price);
		}

		if (qty == null || qty.trim().length() == 0) {
			isError = true;
			request.setAttribute("qtyError", "Please Enter Qty");
		}else {
			request.setAttribute("qtyValue", qty);
		}

		if (isError) { // if(isError == true)
			// go back
			RequestDispatcher rd = request.getRequestDispatcher("AddBook.jsp");
			rd.forward(request, response);
		} else {
			// go ahed
			// nextFilter ? Servlet ?
			
		}

	}

	public void destroy() {
	}
}
