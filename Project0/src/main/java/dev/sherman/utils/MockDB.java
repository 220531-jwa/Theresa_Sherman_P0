package dev.sherman.utils;

import java.util.ArrayList;
import java.util.List;

import dev.sherman.models.Client;

public class MockDB {

	public static List<Client> clients = new ArrayList<>();
	
	static {
		clients.add(new Client(0, "Bologne5", "isham"));
		clients.add(new Client(1, "TRita", "margarita"));
		clients.add(new Client(2, "Johnson2", "passpass"));
		clients.add(new Client(3, "AlphaMom", "dogsforever"));
		clients.add(new Client(4, "TonyMontana", "scarface"));
		clients.add(new Client(5, "Albertalways", "never"));
		clients.add(new Client(6, "MiniCooper", "car"));
		clients.add(new Client(7, "BuffaloBill", "silence"));
		clients.add(new Client(8, "RebeccaBlack", "friday"));
		clients.add(new Client(9, "JellyRoll", "sonofasinner"));
		clients.add(new Client(10, "Eminemm", "Detroit"));
		clients.add(new Client(11, "BeastieBoy", "forever"));
	}
}
