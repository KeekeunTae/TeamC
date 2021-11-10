import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanul.study.CalcDTO;
import com.hanul.study.SumMachine;


@WebServlet("/s02.do")
public class Servlet02 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		SumMachine sm = new SumMachine();
		int sum = sm.getSum(num1, num2);
		
		CalcDTO dto = new CalcDTO(num1, num2, sum);
		request.setAttribute("dto", dto);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");	
		rd.forward(request, response);
	}

}
