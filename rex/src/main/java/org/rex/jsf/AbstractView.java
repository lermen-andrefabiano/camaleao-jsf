package org.rex.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public abstract class AbstractView {

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,	summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
}
