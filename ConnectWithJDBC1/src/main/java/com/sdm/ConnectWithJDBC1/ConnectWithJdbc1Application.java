package com.sdm.ConnectWithJDBC1;

import com.sdm.ConnectWithJDBC1.model.Student;
import com.sdm.ConnectWithJDBC1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ConnectWithJdbc1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(ConnectWithJdbc1Application.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(11);
		s1.setName("Tanu");
		s1.setMarks(80);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);


	}

}
