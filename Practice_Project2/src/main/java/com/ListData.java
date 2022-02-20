//package com;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
///**
// * Servlet implementation class ListData
// */
//@WebServlet("/list")
//public class ListData extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//   
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		response.setContentType("text/html");
//		SessionFactory factory= HibernateUtil.getSessionFactory();
//		Session session= factory.openSession();
//				
//		
//		List<Product> list= session.createQuery("from Product").list();
//		
//		PrintWriter out=response.getWriter();
////		out.print("<h1>product List</h1><hr>");
////		PrintWriter out=response.getWriter();
//		 out.println("<html>  <link rel='stylesheet' href='Style.css' ><body><div class='container'><h3 style='text:center'>Product Details</h3>");
//		 out.print("<table class='table'>  <thead><tr><th>ID</th><th>Product Name</th><th>Price</th><th>Product Category</th><th>Product Description</th><th>Product Manufacture</th></tr> </thead>"); 
//		 for(Product p:list)
//			  
//		{
//			 
//			  
//			  
//			out.print("<tbody><td>"+p.getId()+"</td> "+"<td>"+p.getName()+"</td><td>"+p.getPrice()+"</td>");
////			out.print("Product Parts<br>");
//			
//			ProductParts part= p.getParts();
//			out.print("<td> "+part.getCat()+"</td>");
//			out.print("<td> "+part.getDesc()+"</td>");
//			out.print("<td>"+part.getMfg()+"</td></tbody>");
////			out.print("----------------------------------<br>");
//		}
//		  out.println("</table>");
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
