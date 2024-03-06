package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deleteBook", value = "/deleteBook") 
public class deleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int id_num = Integer.parseInt(id);
        // Assuming you have a 'books' table with a primary key 'id'
        String sql = "DELETE FROM Books WHERE id=?";
        
        try (Connection conn = BookDaoHandler.connectDB();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id_num);
            stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions or display error message
        }
        response.sendRedirect("viewBook");
	}

}
