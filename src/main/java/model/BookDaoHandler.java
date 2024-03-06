package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoHandler {
	public static Connection connectDB() 
    { 
        // connection object 
        Connection connection = null; 
        try { 
        
        Class.forName("org.postgresql.Driver"); 
        
        connection = DriverManager.getConnection( 
            "jdbc:postgresql://127.0.0.1:5432/dvdrental", 
            "postgres", "Roing@792110"); 
        } 
  
        catch (Exception message) { 
            System.out.println(message); 
        } 
        return connection; 
    }
	
//	public static int addBook(Book book) throws SQLException 
//    { 
//        int result = 0; 
//        Connection connect = BookDaoHandler.connectDB(); 
//        PreparedStatement preparedStatement 
//            = connect.prepareStatement( 
//                "INSERT INTO Books (title, author, price) VALUES (?, ?, ?)"); 
//        preparedStatement.setString(1, book.getTitle()); 
//        preparedStatement.setString(2, book.getAuthor());
//        preparedStatement.setBigDecimal(3, book.getPrice());
//        result = preparedStatement.executeUpdate();     
//        connect.close(); 
//        return result; 
//    }
//	
//    public static int updateBook(Book book) throws SQLException 
//    { 
//        int result = 0; 
//        Connection connect = BookDaoHandler.connectDB(); 
//        PreparedStatement preparedStatement 
//            = connect.prepareStatement( 
//                "UPDATE Books set title=?,author=?,price=? where id=?"); 
//      
//        preparedStatement.setString(1, book.getTitle()); 
//        preparedStatement.setString(2, book.getAuthor());
//        preparedStatement.setBigDecimal(3, book.getPrice());
//        result = preparedStatement.executeUpdate(); 
//        connect.close(); 
//        return result; 
//    } 
//    
//    public static int deleteBook(int id) throws SQLException 
//    { 
//        int result = 0; 
//        Connection connect = BookDaoHandler.connectDB(); 
//        PreparedStatement preparedStatement 
//            = connect.prepareStatement( 
//                "delete from Books where id =?"); 
//        preparedStatement.setInt(1, id); 
//        result = preparedStatement.executeUpdate(); 
//        connect.close(); 
//        return result; 
//    } 
//    
//    public static Book getBookById(int id) throws SQLException 
//    {  
//    	Book book = new Book(); 
//        Connection connect = BookDaoHandler.connectDB(); 
//        PreparedStatement preparedStatement 
//            = connect.prepareStatement( 
//                "select * from Books where id=?"); 
//        preparedStatement.setInt(1, id); 
//        ResultSet resultSet 
//            = preparedStatement.executeQuery(); 
//        if (resultSet.next()) {           
//        	book.setTitle(resultSet.getString(2)); 
//        	book.setAuthor(resultSet.getString(3));
//        	book.setPrice(resultSet.getBigDecimal(4));
//        }  
//        connect.close(); 
//        return book; 
//    } 
//    public static List<Book> getAllBooks(int start, 
//                                         int total) 
//        throws SQLException 
//    { 
// 
//        List<Book> list = new ArrayList<Book>(); 
//        Connection connect = BookDaoHandler.connectDB(); 
//        PreparedStatement preparedStatement 
//            = connect.prepareStatement( 
//                "select * from Books limit " + (start - 1) 
//                + "," + total); 
//        ResultSet resultSet 
//            = preparedStatement.executeQuery(); 
//        while (resultSet.next()) { 
//        	Book book = new Book(); 
//        	book.setTitle(resultSet.getString(2)); 
//        	book.setAuthor(resultSet.getString(3));
//        	book.setPrice(resultSet.getBigDecimal(4)); 
//            list.add(book); 
//        } 
//        connect.close(); 
//        return list; 
//    } 
}
