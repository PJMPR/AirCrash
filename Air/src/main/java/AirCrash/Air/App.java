package AirCrash.Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.RepositoryCatalog;
import repositories.IRepositoryCatalog;
import uow.IUnitOfWork;
import uow.UnitOfWork;

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
            IUnitOfWork uow = new UnitOfWork(connection);
            IRepositoryCatalog catalogOf = new RepositoryCatalog(connection, uow);

         } catch (SQLException e) {
             e.printStackTrace();
         }
    	 //List<Customer> customer = catalogOf.Customers().withName("asfa");
    }
}
