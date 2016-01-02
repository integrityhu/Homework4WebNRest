package org.jboss.samples.rs.webservices;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/rest/PostMessageRESTApplication")
public class PostMessageResource {

	@POST()
	@Produces("text/plain")
	public String sayHello(@FormParam("username") String userName, @FormParam("passwd") String passwd) {
	    return "Hello "+userName+" with secret("+passwd+")!";
	}
}
