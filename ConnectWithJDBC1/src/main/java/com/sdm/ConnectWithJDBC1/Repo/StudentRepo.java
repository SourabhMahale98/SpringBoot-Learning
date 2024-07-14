package com.sdm.ConnectWithJDBC1.Repo;

import com.sdm.ConnectWithJDBC1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public void save(Student s) {
        String sqlQuery = "insert into Student (rollNo,name,marks) values (?,?,?);";

        int rowafftected = jdbcTemplate.update(sqlQuery,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rowafftected + "  row Affected");

    }

    public List<Student> findAll() {
        String sql = "Select * from student";

        //Functinal Interface so we are suing lambda function
        RowMapper<Student> mapper = (ResultSet rs, int rowNum) -> {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;

        };

        return jdbcTemplate.query(sql,mapper);

    }
}
