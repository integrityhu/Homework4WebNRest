package org.jboss.samples.rs.webservices;

import hu.infokristaly.back.utils.Resources;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/rest/GetMessageRESTApplication")
public class GetMessageResource {

	@GET()
	@Produces("text/plain")
	public String sayHello(@QueryParam("username") String userName, @QueryParam("message") String message) {
	    return "Hello userName " + userName + " [" + Resources.getFilteredList(userName).indexOf(userName)+"] with message("+message+")!";
	}
}
