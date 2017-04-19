/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAO {

    private static String HOST = "localhost:";
    private static String PORT = "3306/";
    private static String DB_NAME = "c1608l";
    private static String USER_NAME = "root";
    private static String PASS = "";

    public static Connection DBConnection() throws SQLException {
        String url = "jdbc:mysql://" + HOST + PORT + DB_NAME;
        Connection conn = DriverManager.getConnection(url, USER_NAME, PASS);
        return conn;

    }

    public static void main(String[] args) {
        try {
            DAO.DBConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
