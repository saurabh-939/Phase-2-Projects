<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<html>  
<link rel='stylesheet' href='Style.css' >
<body><div class='container'>
<h3 style='text:center'>Product Details</h3>
 <%
           Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/products","root","root");
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from eproduct") ;
       %>
<table class='table'>  
<thead>
<tr>

<th>Product Name</th>
<th>Price</th>
<th>Product Category</th>
<th>Product Description</th>
<th>Product Manufacture</th>
</tr> 
</thead>
<tbody>

<% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
     
      </TR>
      <% } %>
</tbody>
</table>

</body>
</html>