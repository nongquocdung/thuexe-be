package hcmut.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/car")
public class XeController {
    @GET
    public Response getAllXe() {
        return Response.ok("Test API").build();
    }
}
