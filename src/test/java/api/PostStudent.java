package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Student;

import static io.restassured.RestAssured.given;

public class PostStudent {
    public Response createAStudent(Student student){
        return given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(student)
                .post();
    }
}
