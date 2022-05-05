package model;


import com.github.javafaker.Faker;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String programme;
    private List<String> courses;


    private Student(){
        Faker faker = new Faker();
        this.id = 101;
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.programme = "Test";
        this.courses = new ArrayList<>();
        courses.add(faker.educator().course());
        courses.add(faker.educator().course());
    }
    public static Student getInstance(){
        return new Student();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

}
