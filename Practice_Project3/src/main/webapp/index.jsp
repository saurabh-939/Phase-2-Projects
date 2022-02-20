<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="Style.css">

    <title>Products </title>
  </head>
  <body>
 
   <div class="container mt-2">
    <center> <a href="dashboard.jsp" class="mb-2 ">View Stored Product</a></center> 
   <form action="session.jsp" method="post" class="mt-3">
  <div class="form-group">
    <label>Product Name</label>
    <input type="text" class="form-control"  name="pname">
    
  </div>
  
    <div class="form-group">
    <label>Product Price</label>
    <input type="number" class="form-control"  name="pprice">
  </div>
  
  <div class="form-group">
    <label>Product Category</label>
    <input type="text" class="form-control"  name="cat">
  </div>
  
   <div class="form-group">
    <label>Product Description</label>
    <input type="text" class="form-control"  name="desc">
  </div>
  
  <div class="form-group">
    <label>Product Manufacture</label>
    <input type="text" class="form-control"  name="mfg">
  </div>
  
  
 
 
  <button type="submit" value="Save Data Using Component" class="btn btn-primary">Add Product</button>
</form>
   
   </div>

   
  </body>
</html>