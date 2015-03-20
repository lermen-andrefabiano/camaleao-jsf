package org.rex.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.rex.jsf.component.Tab;

@ManagedBean
public class WorkspaceView extends AbstractView{
	
	private List<Tab> tabs;

    @PostConstruct
    public void init() {
        tabs = new ArrayList<Tab>();
    }

    public void add(String page) {
        tabs.add(new Tab("tab" + tabs.size(), page));
    }

    public void remove(Tab tab) {
        tabs.remove(tab);
    }

    public List<Tab> getTabs() {
        return tabs;
    }

}
