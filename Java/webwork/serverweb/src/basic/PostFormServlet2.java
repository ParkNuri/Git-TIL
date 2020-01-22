package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })	//@webServlet�� ���� xml�������� ������
public class PostFormServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		//response.setContentType("test/html;charset=euc-kr");	//���� ������ ������ �� ��� �ٿ�ε� ���Ϸ� ����
		PrintWriter pw = response.getWriter();
		//��û���� ����
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] favor = request.getParameterValues("item");
		
		//������ �밳 ����ǿ��� ���ߵǾ��⶧���� req, res ��� �ѱ� ��ȯ ó���� �ؾ��Ѵ�.
		//�Է��Ҷ� BufferedReader ����Ҷ� PrintWriter�� ���� ��
		//���䳻���� ����
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>������</h1>");
		pw.print("<h3>���̵�: "+id+"</h3>");
		pw.print("<h3>����: "+name+"</h3>");
		pw.print("<h3>Favorites: </h3>");
		for (String data : favor) {
			pw.print(data+" ");
		}
		pw.print("</body>");
		pw.print("</html>");
	}

}
