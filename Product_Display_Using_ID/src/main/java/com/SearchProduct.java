package com;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBConnection;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Servlet implementation class SearchProduct
 */
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SearchProduct() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 try {
             PrintWriter out = response.getWriter();
             out.println("<html>  <link rel='stylesheet' href='Style.css' ><body><div class='container'><h3 style='text:center'>Product Details</h3>");
             
            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
            Properties props = new Properties();
            props.load(in);
            
            
            DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
            Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String id=request.getParameter("product_id");
            ResultSet rst = stmt.executeQuery("select * from eproduct where id="+id);
          
           
            while (rst.next()) {
            
            		out.print("<table class='table'>  <thead><tr><th>ID</th><th>Product Name</th><th>Price</th><tr> </thead><tbody>");
                    out.println("<td>"+rst.getInt("ID") +"</td>"+ ", " +"<td>"+ rst.getString("name") +"</td>"+ "<td>"+rst.getInt("price")+"</td>"+"<Br>");
                    out.println("</tbody></table>");
            }
            if(rst.last()==false) {
        	   out.println("Not Found !");
           }
          
                  
            
            
            
            out.println("</div></body></html>");
            conn.closeConnection();
            
            stmt.close();
            
            conn.closeConnection();
            
            
     
            
    } catch (ClassNotFoundException e) {
            e.printStackTrace();
    } catch (SQLException e) {
            e.printStackTrace();
    }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
