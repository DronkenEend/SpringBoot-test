package dev.dronkeneend.SpringTest;

import dev.dronkeneend.SpringTest.school.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
		createStudents();

	}

	private static void createStudents() {
		Student casper = new Student("Casper", 18, 'M', LocalDate.of(2005, 8, 22));
		Student monalisa = new Student("Monalisa", 92, 'F', LocalDate.of(1931, 5, 11));
		Student vincent = new Student("Vincent", 119, 'M', LocalDate.of(1903, 12, 3));
	}

}
