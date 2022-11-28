package travel.management.system;

import java.sql.*;

//import java.sql.DriverManager;


public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","12345");
            
            statement = connection.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
