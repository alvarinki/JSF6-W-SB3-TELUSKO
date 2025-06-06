package org.acf.SpringJDBCEx;

import org.acf.SpringJDBCEx.model.Student;
import org.acf.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRoll_No(101);
		s.setName("Paco");
		s.setMarks(90);
		StudentService studentService= context.getBean(StudentService.class);
		 studentService.addStudent(s);

		 List<Student> students = studentService.getStudents();
		System.out.println(students);

	}

}
