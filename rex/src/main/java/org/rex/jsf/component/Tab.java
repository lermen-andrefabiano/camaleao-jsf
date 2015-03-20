package org.rex.jsf.component;

import java.io.Serializable;

public class Tab implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	
	private String page;

	public Tab(String title, String page) {
		this.title = title;
		this.page = page;
	}

	public String getTitle() {
		return title;
	}

	public String getPage() {
		return page;
	}

}
