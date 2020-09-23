package com.he.addressBook;

public class Address {

	private String label;
	private String address;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address(String label, String address) {
		super();
		this.label = label;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [label=" + label + ", address=" + address + "]";
	}
	
	
	
	/*
	 * public Address(String label, String address) throws Exception { // TODO }
	 * 
	 * public String getLabel() { return this.label; }
	 * 
	 * public String getAddress() { return this.address; }
	 */
}
