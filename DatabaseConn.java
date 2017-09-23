import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConn {

  private Connection dbConnection;

  public void getDBConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:8000", "root", "password");
  }

  public int executeQuery(String query) throws ClassNotFoundException, SQLException {
    return dbConnection.createStatement().executeUpdate(query);
  }
}