/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlns;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Tuan
 */
public class DBConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/qlhd";
        var user = " root";
        var password = "";
        try(Connection conn = DriverManager.getConnection(url,user,password)){
            System.out.println("Kết nối thành công csdl");
            System.out.println(conn.getCatalog());
        }catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
