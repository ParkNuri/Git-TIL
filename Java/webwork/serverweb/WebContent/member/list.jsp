<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
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
	ArrayList<MemberDTO> memlist =(ArrayList<MemberDTO>)request.getAttribute("memlist");
	%>
	<input type="button" value="ȸ������ �������� ���ư���" class="btn btn-success" onclick="history.go(-1)"/>
	<h1>�μ� ��� ��ȸ</h1>
    	<table><tr><th>�μ���ȣ</th><th>���</th><th>����</th><th>�ּ�</th><th>����Ʈ</th><th>���</th>
    	<% for (MemberDTO items : memlist) {	%>		
    		<tr><td><%=items.getDeptno()%></td>
    			<td><%=items.getId()%></td>
    			<td><a href="/serverweb/member/read.do?id=<%=items.getId()%>"><%=items.getName()%></a></td>
    			<td><%=items.getAddr()%></td>
    			<td><%=items.getPoint()%></td>
    			<td><%=items.getGrade()%></td>
    			<td><a href="/serverweb/member/delete.do?id=<%=items.getId()%>&info=test">����</a></td></tr>
		<%}%>
		</table>

</body>
</html>