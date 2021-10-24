import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test01 {
    @Test
    void test_01(){

        Response response = RestAssured.get("http://universities.hipolabs.com/search?country=Eritrea");

        System.out.println(response.asString());
        int actualStatusCode = response.getStatusCode();

        Assert.assertEquals(actualStatusCode, 200);

    }
}
