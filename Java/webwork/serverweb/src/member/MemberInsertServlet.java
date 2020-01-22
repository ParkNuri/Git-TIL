package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="memInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		int point = Integer.parseInt(request.getParameter("point"));
		String grade = request.getParameter("grade");
		
		System.out.println("�μ���ȣ: "+deptno);
		System.out.println("����: "+name);
		System.out.println("���: "+id);
		System.out.println("�н�����: "+pass);
		System.out.println("�ּ�: "+addr);
		System.out.println("����Ʈ: "+point);
		System.out.println("���: "+grade);
		
		MemberDTO dto = new MemberDTO(id, pass, name, addr, deptno, point, grade);
		MemberDAO dao = new MemberDAOImpl();
		
		int result = dao.insert(dto);
		
		request.setAttribute("result", result);
		request.setAttribute("name", name);
		
		RequestDispatcher rd =request.getRequestDispatcher("/member/insertResult.jsp");
		
		rd.forward(request, response);
	}

}
