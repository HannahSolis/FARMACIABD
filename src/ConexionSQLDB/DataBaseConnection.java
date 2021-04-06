package ConexionSQLDB;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;

public class DataBaseConnection {
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
                String myDB="jdbc:oracle:thin:@localhost:1521:XE";
                String usuario="FARMACIA";
                String password="pepinos";
                
                Connection cnx= DriverManager.getConnection(myDB,usuario,password);
                
                return cnx;
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }    
}
