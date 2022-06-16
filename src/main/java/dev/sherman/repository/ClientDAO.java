package dev.sherman.repository;

import java.util.List;

import dev.sherman.models.Client;
import dev.sherman.utils.MockDB;

//DAO Design Patter
//DAO-Data Access Object
//This class defines the methods to be used to interact with the MockDB

public class ClientDAO {

	/*CRUD Methods- Create, read, update and delete
	 * Create a new 'record' in our database
	 * 	to register a new client
	 * Read (query) data from our DB
	 * 	search for existing users, check credentials, list all users, etc.
	 * Update data in our database
	 * 	update an existing 'record' in our DB such as changing the account balance
	 * Delete record from our database
	 * 	Client deletes their account
	 * */
	
	//List all Clients in the DB
	public List<Client> getAllClients(){
		return MockDB.clients;
		
	}
	public Client getClientById(int clientId) {
		Client c = MockDB.clients.get(clientId);
		return c;
	}
	
	public Client getClientByUsername(String username) {
		for (Client c : MockDB.clients) {
			if (c.getUsername().equals(username)) {
				return c;
			}
		}
		return null;
	}
	
	//Create a client
	public Client createClient(Client c) {
		MockDB.clients.add(c);
		return c;
		
	}
	//Delete a client
	public Client RemoveClient(Client c) {
		MockDB.clients.remove(c);
		return c;
	
	}
	//Update a client
}

