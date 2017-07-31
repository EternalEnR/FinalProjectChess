package model;

import java.util.ArrayList;

public class Player {
	
	private String username;
	private String password;
	private int xp;
	private String personalInformation;
	private ArrayList<Game> gamesList;
	
	public Player(String username, String password, String personalInformation) {
		this.username = username;
		this.password = password;
		this.personalInformation = personalInformation;
		this.xp=0;
		gamesList = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public ArrayList<Game> getGamesList() {
		return gamesList;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	public void xpIncrease(){
		xp+=10;
	}
}
