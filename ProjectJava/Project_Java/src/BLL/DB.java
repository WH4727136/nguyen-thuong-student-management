/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thái Dương
 */
public class DB {
    private static Connection ketNoi;
 public static Connection getKetNoi() throws SQLException
 {
 try
 {
    //buoc 1: nap trinh dieu khien
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    //buoc 2: tao chuoi ket noi
    String url="jdbc:sqlserver://LAPTOP-6JGG43F5\\SQLEXPRESS:1433;databaseName=QLTHPTNT";
    //buoc 3: tao ket noi
    ketNoi=DriverManager.getConnection(url, "sa", "123456");
    }
    //catch(ClassNotFoundException e){e.printStackTrace();}
    catch(ClassNotFoundException | SQLException e)
    {
    e.printStackTrace();
    }
    return ketNoi;
 }
}
