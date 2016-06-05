package simpleservice.rest;

import simpleservice.impl.SimpleServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/simpleservice")
public class SimpleServiceRest {

  private final SimpleServiceImpl service = new SimpleServiceImpl();

  @GET
  @Produces("text/plain")
  public String get() {
    return service.doWork();
  }

}
