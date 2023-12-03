package dev.dronkeneend.SpringTest.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            System.out.println("Putting students into a database.");
            repository.saveAll(StudentController.students);
        };
    }
}
