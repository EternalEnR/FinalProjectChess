package controller;

import java.util.ArrayList;

import exceptions.WrongUsernameOrPasswordException;
import model.Player;
import view.LoginFrame;

public class General {
	private ArrayList<Player> playersList;
	private Player selectedPlayer;
	private LoginFrame loginFrame;
	
	public General(ArrayList<Player> playersLsit,LoginFrame loginFrame){
		this.playersList=playersList;
		this.loginFrame=loginFrame;
	}
	
	public void start(){
		loginFrame.setVisible(true);
	}
	
	public void login (String user, String pass){
		if(playersList.size()==0){
			try{
				throw new WrongUsernameOrPasswordException();
			}
			catch(WrongUsernameOrPasswordException e){
				e.showDialog();
			}
		}
		else{
			for (int i = 0; i < playersList.size(); i++) {
				
			}
		}
	}
}
