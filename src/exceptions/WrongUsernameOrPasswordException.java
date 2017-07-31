package exceptions;

import view.ErrorDialog;

public class WrongUsernameOrPasswordException extends Exception {
	public void showDialog(){
		ErrorDialog dialog = new ErrorDialog("Wrong Username Or Password!");
		dialog.setVisible(true);
	}
}
