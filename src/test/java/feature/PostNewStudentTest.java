package feature;


import api.PostStudent;
import base.BaseClass;
import io.restassured.response.Response;
import model.Student;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostNewStudentTest extends BaseClass {
    private final PostStudent createStudent = new PostStudent();
    private final Student student = Student.getInstance();

    @Test
    public void postNewStudent() {
        Response res = createStudent.createAStudent(student);
        res.prettyPrint();
        res.then().statusCode(201).body("msg", equalTo("Student added"));
    }
}
