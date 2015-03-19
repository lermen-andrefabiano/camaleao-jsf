package org.rex.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MenuView extends AbstractView {

	public void save() {
		addMessage("Success", "Data saved");
	}

	public void update() {
		addMessage("Success", "Data updated");
	}

	public void delete() {
		addMessage("Success", "Data deleted");
	}

}
