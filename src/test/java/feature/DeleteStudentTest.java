package feature;

import api.DeleteStudent;
import api.PostStudent;
import base.BaseClass;
import io.restassured.response.Response;
import model.Student;
import org.junit.Test;

public class DeleteStudentTest extends BaseClass {
    private final Student student = Student.getInstance();
    private final PostStudent createStudent = new PostStudent();
    private final DeleteStudent deleteStudent = new DeleteStudent();

    @Test
    public void deleteStudent(){
        // Act: Call API create student
        createStudent.createAStudent(student);

        // Act: Call API delete student
        Response res = deleteStudent.deleteAStudent(student);

        // Assert
        res.then().statusCode(204);

    }
}
