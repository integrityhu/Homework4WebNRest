package hu.infokristaly.back.service;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Stateless
public class ClientsService implements GetMessage, Serializable{

	private static final long serialVersionUID = -2011553973600926570L;
	
	//@Inject Logger logger;

	private static final String MESSAGE_CONTENT = "Jó reggelt";
	
	public String getMessage() {
		return MESSAGE_CONTENT;
	}

}
