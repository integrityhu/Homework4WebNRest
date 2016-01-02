package org.jboss.samples.rs.webservices;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/rest/GetPathMessageRESTApplication")
public class GetPathMessageResource {

	@GET()
	@Produces("text/plain")
	@Path("login/{uid}")
	public String sayHello(@PathParam("uid") String uid) {
	    return "Hello "+uid+"!";
	}
}
