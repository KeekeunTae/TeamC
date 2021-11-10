import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s01.do")
public class Servlet01 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum =0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<body>");
		out.println("첫 번쨰 정수 : "+ num1 + "<br/>");
		out.println("두 번쨰 정수 : "+ num2 + "<br/>");
		out.println("두 정수 사이의 누적합 : "+ sum);
		out.println("</body>");
		out.println();
		out.println();
		out.println();
	}
}
