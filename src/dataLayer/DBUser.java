package dataLayer;

import java.sql.*;

public class DBUser {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webapplog";
    static final String USER = "webappuser";
    static final String PASS = "webappuser123";

    public boolean isValidUserLogin(String sUserName, String sUserPassword){
        boolean isValidUser = false;
        Connection conn = null;
        Statement stmt = null;
        String sql;
        try{
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to data base");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating statement");
            stmt = conn.createStatement();

            sql = "SELECT * FROM users WHERE user_name = \"" +
                    sUserName + "\" AND user_password = \"" + sUserPassword + "\"";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()){
                isValidUser = true;
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt!=null){
                    stmt.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            } try {
                if (conn!=null){
                    conn.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Closing DB connection.");
        return isValidUser;
    }
}