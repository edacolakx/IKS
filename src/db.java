import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eda
 */
public class db {
    Connection conn=null;
   
   public static Connection connect_db()
   {
       try
       {
           Class.forName("org.sqlite.JDBC");
          Connection  conn=DriverManager.getConnection("jdbc:sqlite:iks.sqlite");
           return conn;
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex);
           return null; 
      }
   }
}
