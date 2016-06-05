package junit.simpleservice.rest.v001;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rapidpm.microservice.Main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class SimpleServiceRestTest001 {


  @Before
  public void setUp() throws Exception {
    Main.deploy();
  }

  @After
  public void tearDown() throws Exception {
    Main.stop();
  }

  @Test
  public void testApplicationPath() throws Exception {
    Client client = ClientBuilder.newClient();
    final String restUrl = "http://"+Main.DEFAULT_HOST+":"+Main.DEFAULT_REST_PORT+"/rest/simpleservice";
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
