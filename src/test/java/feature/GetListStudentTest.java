package feature;
import api.GetStudent;
import base.BaseClass;
import io.restassured.response.Response;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetListStudentTest extends BaseClass {
    GetStudent getStudent = new GetStudent();


    @Test
    public void getListStudent() {
        Response res = getStudent.getListStudent();

        res.prettyPrint();
        res.then().statusCode(200);

    }
    @Test
    public void getFirstStudent() {
        Response res = getStudent.getListStudentById("1");
        res.then().statusCode(200).body("email", equalTo("giang.nguyen@gc.com"));
    }
}
