package integration.simpleservice;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class IntegrationTest {

  @Test
  public void testApplicationPath() throws Exception {
    Client client = ClientBuilder.newClient();
    final String restUrl = "http://localhost:7081/rest/simpleservice";
    System.out.println("restUrl = " + restUrl);
    String val = client
        .target(restUrl)
        .request()
        .get(String.class);
    System.out.println("val = " + val);
    Assert.assertEquals("Hello World", val);
    client.close();
  }


}
