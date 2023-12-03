package dev.dronkeneend.SpringTest.school;

import dev.dronkeneend.SpringTest.SpringTestApplication;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static dev.dronkeneend.SpringTest.school.StudentController.students;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(name="student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private final UUID uuid;
    private final String name;
    private final String email;
    private int age;
    private final char sex;
    private LocalDate birthDate;

    public Student(String name, int age, char sex, LocalDate birthDate) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.email = name + "@school.com";
        this.sex = sex;
        this.age = age;
        this.birthDate = birthDate;

        System.out.println("Adding student " + name + " to list");
        students.add(this);
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return Character.toString(sex).equalsIgnoreCase("M") ? "MALE" : "FEMALE";
    }

    @Override
    public String toString() {
        return "Student{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex=" + getSex() +
                ", birthDate=" + birthDate +
                "}\n";
    }
}
