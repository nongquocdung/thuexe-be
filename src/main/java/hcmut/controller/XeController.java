package hcmut.controller;

import hcmut.service.XeService;
import hcmut.service.impl.XeServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/car")
@Produces(MediaType.APPLICATION_JSON)
public class XeController {
    @Inject
    private XeService xeService;

    @GET
    public Response getAllXe() {
        return Response.ok(xeService.getAllXe()).build();
    }
}
