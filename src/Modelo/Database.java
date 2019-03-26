package modelo;
import java.sql.*;
public class Database {
 /* DATOS PARA LA CONEXION */
  /** base de datos por defecto es test*/
  public String db = "hotel?useTimezone=true&serverTimezone=UTC";
  /** usuario */
  public String user = "root";
  /** contraseña de MySql*/
  public String password = "ac75f48ea2";
  /** Cadena de conexion */
  public String url = "jdbc:mysql://localhost:3306/"+db;
  /** variable para trabajar con la conexion a la base de datos */
  public Connection conn = null;

  public Database(){
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.cj.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url+db, user, password);
         System.out.println("Base de datos conectada");
      }catch(SQLException | ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }

   public Connection getConexion()
   {
    return this.conn;
   }
}