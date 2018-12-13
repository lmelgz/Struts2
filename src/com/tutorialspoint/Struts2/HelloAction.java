package com.tutorialspoint.Struts2;

public class HelloAction implements ActionSupport{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String execute() throws Exception{
		return SUCCESS;
		
	}
}
