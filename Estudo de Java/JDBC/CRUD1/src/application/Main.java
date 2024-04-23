package application;

import com.mysql.cj.xdevapi.DbDoc;
import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Oi oi = new Oi();

        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("Rows 1 " + rows1);
            System.out.println("Rows 2 " + rows2);

        }catch(SQLException e){
            e.printStackTrace();
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {

                throw new DbException("Error trying to rollback: " + ex.getMessage());
            }
        } finally{
            DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
