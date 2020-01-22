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

@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ� �����
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>includeȭ��</h1>");
		pw.println("<hr/><hr/><hr/><hr/>");
		
		//1. ������ ���� - request ����
		DeptDTO dept = new DeptDTO("001", "�����", "","","");	//sendRedirect�δ� �ȳѾ��
		request.setAttribute("mydata",dept);
		System.out.println("IncludeServlet����Ϸ�");
		
		
		//2. ��û������ - sendRedirect
		RequestDispatcher rd =request.getRequestDispatcher("/jspbasic/subPage.jsp");	//������
		//RequestDispatcher rd =request.getRequestDispatcher("/serverweb/jspbasic/subPage.jsp");	// HTTP Status 404 ? Not Found ���� �߻� 
		//filepath:/serverweb/serverweb/jspbasic/subPage.jsp -> ��������  servlet.java ���� ���̱� ������ serverweb/serverweb�� ��
		rd.include(request, response);
	}

}
