/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Bismadiana
 */
public class dbkoneksi {
    static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static String DB_USER="root";
    static String DB_PASWORD="";
    static String DB_URL="jdbc:mysql://localhost:3306/mahasiswa";
    
    public static Connection koneksi (){
        try{
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASWORD);
                    
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Gagal Koneksi ke Database");
        }
        return null;
    }
}
