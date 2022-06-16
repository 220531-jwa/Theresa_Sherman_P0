package dev.sherman.models;

public class Client {

	private int clientId;
	private String username;
	private String password;
	
	public Client() {
		
	}
	
	public Client(int clientId, String username, String password) {
		this.clientId = clientId;
		this.username = username;
		this.password = password;
		
	}
	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", username=" + username + ", password=" + password + "]";
	}


	
}
