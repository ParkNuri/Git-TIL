<%@page import="dept.DeptDTO"%>
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
		DeptDTO dept = (DeptDTO)request.getAttribute("dept");	
	%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
		action="/serverweb/action?deptno=<%= "001" %>&state=UPDATE" 
		method="get">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">부서코드</label>
						<div class="col-sm-3">
							<%=dept.getDeptno()%>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 부서명-->
						<label class="control-label col-sm-2" for="orgname">부서명</label>
						<div class="col-sm-3">
							<%=dept.getDeptname()%>
						</div>
					</div>		


					
					<div class="form-group">
						<!-- 부서위치-->
						<label class="control-label col-sm-2" for="orgloc">부서위치</label>
						<div class="col-sm-3">
							<%=dept.getLoc()%>
						</div>
					</div>
					<div class="form-group">
						<!-- 전화번호-->
						<label class="control-label col-sm-2" for="orgtel">전화번호</label>
						<div class="col-sm-3">
							<%=dept.getLoc() %>
						</div>
					</div>

					<div class="form-group">
						<!-- 매니저-->
						<label class="control-label col-sm-2" for="orgtel">관리자</label>
						<div class="col-sm-3">
							<%=dept.getMgr()%>
						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="수정" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>