package org.acf.SpringJDBCEx.repos;

import lombok.Getter;
import org.acf.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s){
        String sqlInsert= "INSERT INTO student (roll_no, name, marks) VALUES (?, ?, ?)";
       int rows= jdbc.update(sqlInsert, s.getRoll_No(), s.getName(), s.getMarks());
        System.out.println("Rows inserted: " + rows);

        System.out.println("Student saved");
    }

    public List<Student> findAll() {

        String sqlSelect = "SELECT * FROM student";
        return jdbc.query(sqlSelect, (rs, rowNum) -> {
            Student s = new Student();
            s.setRoll_No(rs.getInt("roll_no"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
