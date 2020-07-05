package bookStore.client;

import bookStore.util.ClientUiUtil;

/**
 * login view
 * @author acmil
 *
 */
public class BookStoreClientLogInView {
	
	//constructor
	public BookStoreClientLogInView() {
		//nothing to do here
	}
	
	//server initialized message
	public void showServerInitializationStatus(String message) {
		ClientUiUtil.systemOut(message);
	}
	
	//show login message
	public void showLogInMessage() {
		ClientUiUtil.systemOut("WelCome to Our Book Store Management System!");
		ClientUiUtil.systemOut("Please Enter your user name and password. Or 1: create new user / exit: close system.");
	}
	
	//show register user name
	public void showNewUserName() {
		ClientUiUtil.systemOut("enter new user name");
	}
	
	//show register user type
	public void showNewUserType() {
		ClientUiUtil.systemOut("enter new user type");
	}
	
	//show register user name
	public void showNewUserPassword() {
		ClientUiUtil.systemOut("enter new user password");
	}
	
	//show system over
	public void showExit() {
		ClientUiUtil.systemOut("Exit System.");
	}
	
	//show wrong id or password
	public void showWrongUserAndPas(){
		ClientUiUtil.systemOut("Wrong user or password. Use space to split id and password.");
	}
}
