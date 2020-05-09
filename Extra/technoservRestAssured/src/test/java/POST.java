import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POST {
    @Test
    public void POSTmeth(){
        JSONObject jsonObj = new JSONObject()
                .put("id", 7)
                .put("email","test@gmail.com")
                .put("first_name","FirstName")
                .put("last_name","LastName")
                .put("avatar","https://s3.amazonaws.com/uifaces/faces/twitter/testuser/128.jpg");

        ResponseBody postBody =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .body(jsonObj.toString())
                .when()
                        .post("https://reqres.in/api/users")
                ;

        String postResult = postBody.asString();
        Assert.assertTrue(postResult.contains(jsonObj.toString().replace("}", "")));
    }
}
