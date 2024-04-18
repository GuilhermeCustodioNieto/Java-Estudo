package application;

import com.mysql.cj.xdevapi.DbDoc;
import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement("INSERT INTO seller " +
                    "(Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1,"Guilherme Nieto");
            st.setString(2, "guilhermecustodionieto@gmail.com");
            st.setDate(3, new Date(fmt.parse("11/09/2001").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rowsUpdated = st.executeUpdate();

            if(rowsUpdated > 0) {
                ResultSet rs = st.getGeneratedKeys();

                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }

        }catch(SQLException e){
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally{
            DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
