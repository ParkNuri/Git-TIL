package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class DeptListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.setContentType("text/html;charset=euc-kr");
    	
    	//PrintWriter pw = response.getWriter();
    	
    	DeptDAO dao = new DeptDAO();
    	ArrayList<DeptDTO> deptlist= new ArrayList<DeptDTO>();
    	deptlist = dao.getDeptList();
    	
    	request.setAttribute("deptlist",deptlist);
    	
    	RequestDispatcher rd =request.getRequestDispatcher("/dept/list.jsp");	//������
		rd.forward(request, response);
    	
		/*pw.print("<h1>�μ� ��� ��ȸ</h1>");
    	pw.print("<table><tr><th>�μ���ȣ</th><th>�μ��̸�</th><th>�μ���ġ</th><th>�μ��Ŵ���</th><th>�μ���ȭ��ȣ</th>");
    	for (DeptDTO items : deptlist) {			
    		pw.print("<tr><td>"+items.getDeptno()+"</td>");
    		pw.print("<td>"+items.getDeptname()+"</td>");
    		pw.print("<td>"+items.getLoc()+"</td>");
    		pw.print("<td>"+items.getMgr()+"</td>");
    		pw.print("<td>"+items.getTel()+"</td>");
    		pw.print("<td>"+"<a href='/serverweb/dept/delete.do?deptno="+items.getDeptno()+"&info=test'>����</a></td></tr>");
		}
    	
    	
    	pw.print("</table>");*/
    }

}
