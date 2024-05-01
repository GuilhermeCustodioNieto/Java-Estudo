package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn = null;

    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE department \n" +
                    "SET Id = ?, Name = ?\n" +
                    "WHERE Id = ?");

            st.setInt(1, obj.getId());
            st.setString(2, obj.getName());

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
    @Override
    public void deleteById(Department obj) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");

            st.setInt(1, obj.getId());

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }


    }

    @Override
    public Department findById(Integer id) {
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM department WHERE Id = ?");

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                return new Department(rs.getInt("Id"), rs.getString("Name"));
            }

            return null;
        }catch (SQLException e){
                    throw new DbException(e.getMessage());
        }


    }

    @Override
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();

        try{
            PreparedStatement st = conn.prepareStatement("SELECT * FROM department");

            ResultSet rs = st.executeQuery();

            while(rs.next()) {
                departments.add(new Department(rs.getInt("Id"), rs.getString("Name")));
            }

            return departments;


        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}
