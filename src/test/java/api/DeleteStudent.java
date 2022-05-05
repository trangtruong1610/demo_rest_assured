package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Student;

import static io.restassured.RestAssured.given;

public class DeleteStudent {
    public Response deleteAStudent(Student student){
        return given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .delete("/{id}", student.getId());
    }
}
