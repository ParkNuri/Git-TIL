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
		int result = (int)request.getAttribute("result");
		String name = (String)request.getAttribute("name");
		if(result==1){
	%>
	<h2>�ݰ����ϴ� <%=name %>����!! ȸ�������� �Ϸ�Ǿ����ϴ�.</h2>
	<%}else{%> 
		<h2>ȸ�����Կ� �����Ͽ����ϴ�. �ٽ� �õ����ּ���.</h2>
	<%}  %>
</body>
</html>