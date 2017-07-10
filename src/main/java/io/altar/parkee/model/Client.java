package io.altar.parkee.model;

public class Client {
	
	private int clientId;
	private String clientName;
	private int clientContact;
	private int NIF;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int id) {
		this.clientId = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String name) {
		this.clientName = name;
	}
	public int getClientContact() {
		return clientContact;
	}
	public void setClientContact(int contact) {
		this.clientContact = contact;
	}
	public int getNIF() {
		return NIF;
	}
	public void setNIF(int nif) {
		NIF = nif;
	}
	
	
}
