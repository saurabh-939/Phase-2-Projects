package com;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Servlet implementation class SaveDetails
 */
@WebServlet("/save")
public class SaveDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("pname");
		String price=request.getParameter("pprice");
		String cat=request.getParameter("cat");
		String desc=request.getParameter("desc");
		String mfg=request.getParameter("mfg");
		
		if(name.isEmpty() || price.isEmpty() || cat.isEmpty() || 
				desc.isEmpty() || mfg.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			req.include(request, response);
		}
		else
		{
			
			ProductParts parts= new ProductParts(cat,desc,mfg);
			Product product=new Product(name, new BigDecimal(price), parts);
			
			SessionFactory factory= HibernateUtil.getSessionFactory();
			Session session= factory.openSession();
			
			Transaction t= session.beginTransaction();
			session.save(product);
			
			t.commit();
			session.close();
			
			RequestDispatcher req = request.getRequestDispatcher("dashboard.jsp");
			req.forward(request, response);
		}
		
	
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
