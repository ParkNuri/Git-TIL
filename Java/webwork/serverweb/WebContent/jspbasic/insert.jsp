<%-- <%@page import="dept.DeptDAO"%>
<%@page import="dept.DeptDTO"%>
 --%><%@page import="dept.*"%>	<%-- �ѹ��� import --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	//response.setContentType("text/html;charset=euc-kr");		// jsp������ ��ܿ��� �߱⶧���� ���ص��ȴ�.
	
	//1. ��û���� ����
	//web->server ������ �ޱ�
	String deptno = request.getParameter("deptNo");
	String deptname = request.getParameter("deptName");
	String deptloc = request.getParameter("loc");
	String deptphone = request.getParameter("tel");
	String deptadmin = request.getParameter("mgr");
		
	//2. �����Ͻ� �޼ҵ� call
	DeptDTO dto = new DeptDTO(deptno, deptname, deptloc, deptphone, deptadmin);
	DeptDAO dao = new DeptDAO();
	int result=dao.insert(dto);
	%>
	<h1><%=result %>���� �� ���Լ���!~.~</h1>
</body>
</html>