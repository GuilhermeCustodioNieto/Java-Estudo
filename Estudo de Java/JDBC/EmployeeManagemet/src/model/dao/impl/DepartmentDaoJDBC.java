package model.dao.impl;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.*;
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

    }

    @Override
    public void deleteById(Department obj) {

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
        return null;
    }
}
