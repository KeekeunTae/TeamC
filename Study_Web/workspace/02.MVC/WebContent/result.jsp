<%@page import="com.hanul.study.CalcDTO"%>
<%@page import="com.sun.beans.util.Cache"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   request.setCharacterEncoding("UTF-8");
   CalcDTO dto = (CalcDTO) request.getAttribute("dto");
   %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>누적합 결과</title>
</head>
<body>
첫 번쨰 정수 : <%= dto.getNum1() %><br/>
두 번쨰 정수 : <%= dto.getNum2() %><br/>
누적 합 : <%= dto.getSum() %><br/>
</body>
</html>