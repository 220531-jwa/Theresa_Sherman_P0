package dev.sherman.service;

import dev.sherman.models.Client;
import dev.sherman.repository.ClientDAO;

//where we write methods to perform any business logic
	//that our application needs to function appropriately

public class ClientService {
	private ClientDAO clientDao = new ClientDAO();
	
	//login an existing client - 
	//!!!!!!not explicitly listed in project so not required!!!!
	public Client login(String username, String password) {
		//need to use the ClientDAO to access the database
		Client c = clientDao.getClientByUsername(username);
		
		//check if that user even exists
		if (c != null) {
			//If it does - check their credentials match
			if (username.equals(c.getUsername()) && password.equals(c.getPassword())){
				return c;
			}
			
		}
		System.out.println("Credentials do not match!"); //Excellent place for a custom exception
		return null;
	}
	
	
	//create new client
	//and check that username doesn't already exist
}
