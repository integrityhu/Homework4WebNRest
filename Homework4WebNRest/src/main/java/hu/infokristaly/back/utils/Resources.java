package hu.infokristaly.back.utils;

import hu.infokristaly.back.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class Resources {

	   /**
	    * Produces the logger.
	    *
	    * @param injectionPoint the injection point
	    * @return the logger
	    */
	   @Produces
	   public Logger produceLog(InjectionPoint injectionPoint) {
	      return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	   }
	   
	   public static List<?> getFilteredList(String filter) {
		   ArrayList<String> persons = new ArrayList<String>();
		   persons.add("Péter");
		   persons.add("Pál");
		   persons.add("Ildikó");
		   persons.add("Kinga");
		   persons.add("Mária");
		   persons.add("Teréz");
		   persons
		    .stream()
		    .filter(
		        p -> p.indexOf(filter) > 0);
		        
		   return persons;
	   }
}
