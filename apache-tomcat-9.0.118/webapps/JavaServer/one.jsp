<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Form Output</title>
</head>
<body>

<h2>Form Data Submitted:</h2>

<%
    String name = request.getParameter("name");
    String age = request.getParameter("age");

    if (name != null && age != null && !name.trim().isEmpty() && !age.trim().isEmpty()) {
%>

        Name: <%= name %><br>
        Age: <%= age %><br>

<%
    } else {
        out.println("Please enter both Name and Age!");
    }
%>

<br><br>
<a href="index.jsp">Go Back</a>

</body>
</html>