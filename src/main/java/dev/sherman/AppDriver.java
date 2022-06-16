package dev.sherman;

import java.util.List;

import dev.sherman.models.Client;
import dev.sherman.repository.ClientDAO;

import io.javalin.Javalin;

public class AppDriver {
	
	private static ClientDAO clientDao;
  
	public static void main(String[] args) {
		
		//ClientDAO clientDao = new ClientDAO();
		
		//List<Client> clients = clientDao.getAllClients();
		
		
	//	for (Client c : clients) {
	//		System.out.println(c);
		//}
		
	//	Client c = clientDao.getClientById(0);
	//	System.out.println(c);
		clientDao = new ClientDAO();
		Javalin app = Javalin.create();
		
		app.start(8082);
		
		//Javalin provides us with a Context Class (ctx) that represents information
		//about BOTH the HTTP Request AND HTTP Response Objects
		//We'll be using methods from the context class to handle our incoming http requests
		//and to send our http responses.
		app.get("/clients", ctx ->{
			ctx.status(200);
			
			List<Client> clients = clientDao.getAllClients();
			
			ctx.json(clients);
	});
		
		app.get("/test", ctx ->{
			ctx.status(200);
			ctx.result("Test successful!");
		});
		
		app.get("/{name}", ctx ->{
			ctx.status(200);
			String name = ctx.pathParam("name");
			ctx.result("Hello, " + name);
		});
		
	}
}
