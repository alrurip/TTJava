package qlns;
import java.sql.*;
import javax.swing.*;
public class Connect {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
public static Connection ConnectDB(){
    try{
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection conn = DriverManager.getConnection("url,userNam,password");
        //JOptionPane.showMessageDialog(null, "Connection Established");
        return conn;

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}
}