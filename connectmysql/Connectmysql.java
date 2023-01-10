/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmysql;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author DELL
 */
public class Connectmysql {

    public static Connection connecmysqldb(){
        
        try{
            String username = "root";
            String pass = "574643@NJ";
            String sqlconn="jdbc:mysql://localhost:3306/linda";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sqlconn,username,pass);
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
       return null; 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"connection Established");
    }
    
}
