<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>  
<link rel='stylesheet' href='Style.css' >
<body><div class='container'>
<h3 style='text:center'>Product Details</h3>
<a href="index.jsp">Go to Homepage </a>
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

<td><%String name1=(String)session.getAttribute("name"); out.print(name1);%></td>
<td><%String price1=(String)session.getAttribute("price");out.print(price1); %></td>
<td><%String cat1=(String)session.getAttribute("cat");out.print(cat1); %></td>
<td><%String desc1=(String)session.getAttribute("desc");out.print(desc1); %></td>
<td><%String mfg1=(String)session.getAttribute("mfg");out.print(mfg1); %></td>


</table>

</body>
</html>