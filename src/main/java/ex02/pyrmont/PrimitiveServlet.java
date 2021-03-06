package ex02.pyrmont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author mazhiqiang
 * @date 14-3-11.
 */
public class PrimitiveServlet implements Servlet {
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("primary servlet init!!!");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("service method is invoked!!!");
        ((Response)servletResponse).sendOKHeader();
		PrintWriter out = servletResponse.getWriter();
		out.println("Hello. Roses are red.");
		out.print("Violets are blue");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("primary servlet destroyed!");
	}
}
