package org.jboss.samples.rs.webservices;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/rest/GetCookieMessageRESTApplication")
public class GetCookieMessageResource {

	@GET()
	@Produces("text/plain")
	public String sayHello(@CookieParam("sessionid") String sessionid, @HeaderParam("User-Agent") String whichBrowser) {
	    return "Hello "+sessionid+" with user-agent:" + whichBrowser;
	}
}
