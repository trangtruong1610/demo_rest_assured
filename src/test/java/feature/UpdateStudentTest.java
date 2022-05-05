package feature;

import api.PutStudent;
import base.BaseClass;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import model.Student;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UpdateStudentTest extends BaseClass {
    Student student = Student.getInstance();

    private final PutStudent putStudent = new PutStudent();


    @Test
    public void updateStudent(){
        student.setFirstName("Trang");
        student.setLastName("Truong");
        // Update info of Student
        Response res = putStudent.updateStudent(student, "1");

        res.then().statusCode(200).body("msg", equalTo("Student Updated"));

        JsonPath jsonPath = given().when().get("/list").then().extract().body().jsonPath();
        List<Student> students = jsonPath.getList("", Student.class);
        assertThat(students.get(0).getFirstName(), equalTo("Trang"));
        assertThat(students.get(0).getLastName(), equalTo("Truong"));
    }
}
