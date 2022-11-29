package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import util.Validators;

public class AddBookNumericFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("AddBookNumericFilter::doFilter()");

		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		boolean isError = false;

		if (Validators.isDigit(price) == false) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Valid Price");
		} else {
			request.setAttribute("priceValue", price);
		}

		if (Validators.isDigit(qty) == false) {
			isError = true;
			request.setAttribute("qtyError", "Please Enter Valid Qty");
		} else {
			request.setAttribute("qtyValue", qty);
		}

		if (isError) { // if(isError == true)
			// go back
			RequestDispatcher rd = request.getRequestDispatcher("AddBook.jsp");
			rd.forward(request, response);
		} else {
			// go ahed
			// nextFilter ? Servlet ?
			chain.doFilter(request, response);// identify -> next filter ? servlet ?

		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
