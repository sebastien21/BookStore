package bookStore.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bookStore.dto.BookStoreDto;
import bookStore.server.BookStoreServerCommandHandler;
import bookStore.util.CommandType;

/**
 * client user controller
 * @author acmil
 *
 */
public class BookStoreClientUserController {
	
	//view
	private BookStoreClientLogInView view;
	//server command handler
	private BookStoreServerCommandHandler handler;
	
	//constructor
	public BookStoreClientUserController() {
		this.view = new BookStoreClientLogInView();
		this.handler = new BookStoreServerCommandHandler();
	}

	//process
	public void process() throws IOException, ClassNotFoundException{
		view.showLogInMessage();
		BufferedReader readLoginInput = new BufferedReader(new InputStreamReader(System.in));
		String loginInfo = readLoginInput.readLine();
		switch(loginInfo) {
			case "1":
				view.showNewUserName();
				String name = readLoginInput.readLine();
				view.showNewUserType();
				int type = Integer.parseInt(readLoginInput.readLine());
				view.showNewUserPassword();
				String password = readLoginInput.readLine();
				BookStoreDto dto = this.registerUser(name, type, password);
				this.handler.start(CommandType.REGISTERUSER, dto);
				break;
			case "exit":
				view.showExit();
				System.exit(0);
			default:
				String[] login = loginInfo.split(" ");
				if(login.length != 2) {
					view.showWrongUserAndPas();
					return;
				}
				BookStoreDto user = this.loginUser(login[0], login[1]);
				this.handler.start(CommandType.LOGIN, user);
				break;
		}
		
		
	}
	
	//register new user
	private BookStoreDto registerUser(String name, int type, String password) {
		BookStoreDto dto = new BookStoreDto();
		dto.setUserName(name);
		dto.setUserType(type);
		dto.setPassword(password);
		return dto;
	}
	
	//login user
	private BookStoreDto loginUser(String name, String password) {
		BookStoreDto dto = new BookStoreDto();
		dto.setUserName(name);
		dto.setPassword(password);
		return dto;
	}
}
