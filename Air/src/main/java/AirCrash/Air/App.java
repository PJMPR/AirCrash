package AirCrash.Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try {
             Connection connection =
                     DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            

         } catch (SQLException e) {
             e.printStackTrace();
         }
    }
}
