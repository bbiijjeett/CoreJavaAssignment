package model;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "updateBook", value = "/updateBook")
public class updateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	int id = Integer.parseInt(request.getParameter("id"));
	        String title = request.getParameter("title");
	        String author = request.getParameter("author");
	        double price = Double.parseDouble(request.getParameter("price"));
	        // Assuming you have a 'books' table with columns 'title' and 'author'
	        String sql = "UPDATE Books SET title=?, author=?, price=? WHERE id=?";

	        try (Connection conn = BookDaoHandler.connectDB();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, title);
	            stmt.setString(2, author);
	            stmt.setDouble(3, price);
	            stmt.setLong(4, id);
	            stmt.executeUpdate();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            
	        }
	        response.sendRedirect("viewBook");
	}

}
