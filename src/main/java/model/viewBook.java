package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "viewBook", value = "/viewBook") 
public class viewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();

        try (Connection conn = BookDaoHandler.connectDB()) {
            String sql = "select * from Books";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
//                    	System.out.println(resultSet.getString("title"));
                        Book book = new Book();
                        book.setId(resultSet.getString("id"));
                        book.setTitle(resultSet.getString("title"));
                        book.setAuthor(resultSet.getString("author"));
                        book.setPrice(resultSet.getBigDecimal("price"));
//                        book.toString();
                        books.add(book);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("books", books);
        request.getRequestDispatcher("viewBook.jsp").forward(request, response);
	}

}
