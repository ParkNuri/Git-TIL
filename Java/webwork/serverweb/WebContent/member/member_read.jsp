<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<% 
	MemberDTO member = (MemberDTO)request.getAttribute("member");	
%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="" method="POST" 
				name="myform">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="orgcode">�μ��ڵ�</label>
						<div class="col-sm-3">
							<%=member.getDeptno()%>
						</div>
					</div>
				
					
					<div class="form-group">
						<!-- ����-->
						<label class="control-label col-sm-2" for="orgname">����</label>
						<div class="col-sm-3">
							<%=member.getName()%>

						</div>
					</div>
					<div class="form-group">
						<!-- ���-->
						<label class="control-label col-sm-2" for="id">���</label>
						<div class="col-sm-3">
							<%=member.getId()%>
							
						</div>
						<span id="checkVal"></span>
					</div>



				


					
					<div class="form-group">
						<!-- �н�����-->
						<label class="control-label col-sm-2" for="pass">�н�����</label>
						<div class="col-sm-3">
							<%=member.getPass()%>

						</div>
					</div>
					<div class="form-group">
						<!-- �ּ�-->
						<label class="control-label col-sm-2" for="addr">�ּ�</label>
						<div class="col-sm-3">
						<%=member.getAddr()%>

						</div>
					</div>
					<div class="form-group">
						<!-- ����Ʈ-->
						<label class="control-label col-sm-2" for="point">����Ʈ</label>
						<div class="col-sm-3">
						<%=member.getPoint()%>

						</div>
					</div>
					<div class="form-group">
						<!-- ���-->
						<label class="control-label col-sm-2" for="grade">���</label>
						<div class="col-sm-3">
							<%=member.getGrade()%>

						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="button" value="������� ���ư���" class="btn btn-success" onclick="history.go(-1)"/>
						</div>
					</div>
				</fieldset>
			</form>
			<input type="button" name="btn1" value="btn1">
			<input type="button" name="btn2" value="btn2" disabled>
			<hr>
			<input type="button" name="btn3" value="close btn1" onClick="btn1.disabled=true">
			<input type="button" name="btn4" value="open btn1" onClick="btn1.disabled=false">
			<canvas></canvas>		
	</div>
</body>
</html>