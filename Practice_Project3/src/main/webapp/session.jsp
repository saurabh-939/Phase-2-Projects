<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>  
<link rel='stylesheet' href='Style.css' >
<body><div class='container'>
<h3 style='text:center'>Data Stored in Session Sucessfully</h3>
<a href="dashboard.jsp">Click here to view stored data</a>
<% String name=request.getParameter("pname");session.setAttribute("name",name);%>
<% String price=request.getParameter("pprice");  session.setAttribute("price",price);%>
<% String cat=request.getParameter("cat");  session.setAttribute("cat",cat);%>
<% String desc=request.getParameter("desc"); session.setAttribute("desc",desc);%>
<% String mfg=request.getParameter("mfg"); session.setAttribute("mfg",mfg);%>
</body>
</html>