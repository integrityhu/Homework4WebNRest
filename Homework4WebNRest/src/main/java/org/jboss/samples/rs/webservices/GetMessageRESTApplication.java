package org.jboss.samples.rs.webservices;

import java.util.Set;
import java.util.HashSet;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest/RESTApp")
public class GetMessageRESTApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	public GetMessageRESTApplication(){
	     singletons.add(new GetMessageResource());
	     singletons.add(new GetPathMessageResource());
	     singletons.add(new PostMessageResource());
	     singletons.add(new GetCookieMessageResource());
	}
	@Override
	public Set<Class<?>> getClasses() {
	     return empty;
	}
	@Override
	public Set<Object> getSingletons() {
	     return singletons;
	}
}
