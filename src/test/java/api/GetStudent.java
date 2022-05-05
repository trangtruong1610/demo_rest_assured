package api;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetStudent{
    public Response getListStudent(){
        return given().log().all()
                .when()
                .get("/list");
    }

    public Response getListStudentById(String id) {
        return given().log().all()
                .when()
                .get("/{id}", id);
    }
}
