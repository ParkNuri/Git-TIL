<%@page import="java.util.ArrayList"%>
<%@page import="dept.DeptDTO"%>
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
	ArrayList<DeptDTO> deptlist =(ArrayList<DeptDTO>)request.getAttribute("deptlist");
	%>
	<h1>�μ� ��� ��ȸ</h1>
    	<table><tr><th>�μ���ȣ</th><th>�μ��̸�</th><th>�μ���ġ</th><th>�μ��Ŵ���</th><th>�μ���ȭ��ȣ</th>
    	<% for (DeptDTO items : deptlist) {	%>		
    		<tr><td><%=items.getDeptno()%></td>
    			<td><a href="/serverweb/dept/read.do?deptno=<%=items.getDeptno()%>"><%=items.getDeptname()%></a></td>
    			<td><%=items.getLoc()%></td>
    			<td><%=items.getMgr()%></td>
    			<td><%=items.getTel()%></td>
    			<td><a href='/serverweb/dept/delete.do?deptno=<%=items.getDeptno()%>&info=test'<% System.out.println("list.jsp"); %>>>����</a></td></tr>
		<%}%>
		</table>

</body>
</html>