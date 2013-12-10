package com.example.customerservice;

public class NoSuchCustomerException extends Exception {
	
	private static final long serialVersionUID = 1L;

	private String id;

	public NoSuchCustomerException(String id) {
		super("Cannot find a customer with id = " + id);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
