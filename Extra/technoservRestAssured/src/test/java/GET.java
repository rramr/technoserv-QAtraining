import static io.restassured.RestAssured.get;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class GET {
    @Test
    public void GETmeth(){
        Response response = get("https://reqres.in/api/users?page=2");
        List<String> jsonResponse = response.jsonPath().getList("data");
        Assert.assertNotNull(jsonResponse);
    }
}
