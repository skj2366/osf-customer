<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>사원 등록</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/signin.css" rel="stylesheet">
  </head>
  <script>
	window.addEventListener('load',function(){
	});
</script>
  <body class="text-center">
    <form class="form-signin" action="/emp/login" method="post">
      <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Please sign up</h1>
      
      <!-- <select id="dept" name="dept" class="dong-control">
      	<option value="">------부서 선택 ------</option>
      	<option value="10">경리부</option>
      	<option value="20">인사부</option>
      	<option value="30">영업부</option>
      	<option value="40">전산부</option>
      </select><br> -->
      
      <select name="deptNo" id="deptNo" class="form-control">
      	<c:forEach items="${deptList}" var="dept">
      		<option value="${dept.DEPTNO}">${dept.DNAME}</option>
      	</c:forEach>
      </select>
      
      <input type="text" id="id" class="form-control" placeholder="ID" required autofocus name="id">
      <input type="password" id="pwd" class="form-control" placeholder="Password" required name="pwd">
      <input type="text" id="name" class="form-control" placeholder="Write Name" required name="name">
      <!--  <input type="text" id="job" class="form-control" placeholder="Write Job" required name="job">-->
      <select class="form-control">
      	<option value="">직급 선택</option>
      	<option value="사원">사원</option>
      	<option value="대리">대리</option>
      	<option value="과장">과장</option>
      	<option value="차장">차장</option>
      	<option value="부장">부장</option>
      	<option value="사장">사장</option>
      </select>
      <input type="number" id="mgr" class="form-control" placeholder="insert MGR number" required name="mgr" min="1000" max="9999">
      <input type="date" id="hiredate" class="form-control" placeholder="hiredate" required name="hiredate">
      <input type="number" id="sal" class="form-control" placeholder="sal" required name="sal">
      <input type="number" id="comm" class="form-control" placeholder="commition" required name="comm">
      <input type="number" id="deptno" class="form-control" placeholder="deptno" required name="deptno">
      <input type="number" id="lvl" class="form-control" placeholder="level" required name="lvl">
      
  
      <button class="btn btn-lg btn-primary btn-block" type="button" id="signinBtr">Sign up</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
  </body>
</html>
