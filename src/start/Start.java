package start;

import java.util.ArrayList;

import model.Player;
import view.LoginFrame;
import controller.General;

public class Start {

	public static void main(String[] args) {
		ArrayList<Player> playersList = new ArrayList<>();
		LoginFrame loginFrame = new LoginFrame();
		General generalController = new General(playersList,loginFrame);
		loginFrame.setController(generalController);
		generalController.start();
	}

}
