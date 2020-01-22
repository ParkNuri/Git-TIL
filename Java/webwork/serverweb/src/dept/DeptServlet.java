package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import basic.CalcLogic;

@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ� �����
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		//PrintWriter pw = response.getWriter();
		
		//1. ��û���� ����
		//web->server ������ �ޱ�
		String deptno = request.getParameter("deptNo");
		String deptname = request.getParameter("deptName");
		String deptloc = request.getParameter("loc");
		String deptphone = request.getParameter("tel");
		String deptadmin = request.getParameter("mgr");
		
		System.out.println("�μ���ȣ: "+deptno);
		System.out.println("�μ���: "+deptname);
		System.out.println("�μ���ġ: "+deptloc);
		System.out.println("�μ���ȭ��ȣ: "+deptphone);
		System.out.println("�μ�������: "+deptadmin);
		
		//2. �����Ͻ� �޼ҵ� call
		DeptDTO dto = new DeptDTO(deptno, deptname, deptloc, deptphone, deptadmin);
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(dto);
		/*CalcLogic logic = new CalcLogic();
		//int result = logic.calc(num1,method,num2);
		
		//3. ����޽��� ����
		pw.print("<html>");
		pw.print("<body>");
		//pw.print("<h1>num1�� "+num1+"�� num2�� "+num2+"�� ������ ����� "+result+"�Դϴ�.</h1>");
		pw.print("</body>");
		pw.print("</html>");
		*/
		
		
		//3-1. ����ȭ������ ��û ������ - sendRedirect
		//response.sendRedirect("/serverweb/dept/insertResult.html");
		
		
		
		//3-2. ����ȭ������ ��û ������ - forward
		request.setAttribute("result", result);
		
		RequestDispatcher rd =request.getRequestDispatcher("/member/insertResult.jsp");

		rd.forward(request, response);
	}

}
