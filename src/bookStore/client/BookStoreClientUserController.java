package bookStore.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bookStore.dto.BookStoreDto;
import bookStore.server.BookStoreServerCommandHandler;
import bookStore.server.BookStoreServerMain;
import bookStore.util.ClientUiUtil;
import bookStore.util.CommandType;

/**
 * client user controller
 * @author acmil
 *
 */
public class BookStoreClientUserController {
	
	//login check 
	private boolean loginSucceed;
	//dto
	private BookStoreDto dto;
	
	//view
	private BookStoreClientLogInView view;
	//server command handler
	private BookStoreServerCommandHandler handler;
	
	//constructor
	public BookStoreClientUserController() {
		this.view = new BookStoreClientLogInView();
		this.handler = new BookStoreServerCommandHandler();
		this.dto = new BookStoreDto();
	}
	
	//start service
	public boolean startService() {
		try {
			BookStoreServerMain serverStart = new BookStoreServerMain();
			serverStart.initialize(CommandType.LOGIN);
			ClientUiUtil.systemOut(serverStart.getMessage());
			BookStoreClientUserController controller = new BookStoreClientUserController();
			this.dto = controller.process();
			if(this.dto != null) {
				return true;
			} else {
				return false;
			}
		} catch (IOException ioe) {
				return false;
		} catch (ClassNotFoundException cnfe) {
				return false;
		}
	}
	

	//process
	private BookStoreDto process() throws IOException, ClassNotFoundException{
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
				dto = this.handler.start(CommandType.REGISTERUSER, dto);
				if (checkResult(dto)) {
					return dto;
				} else {
					return null;
				}
			case "exit":
				view.showExit();
				System.exit(0);
			default:
				String[] login = loginInfo.split(" ");
				if (login.length != 2) {
					view.showWrongUserAndPas();
					return null;
				}
				BookStoreDto user = this.loginUser(login[0], login[1]);
				user = this.handler.start(CommandType.LOGIN, user);
				if (checkResult(user)) {
					return user;
				} else {
					return null;
				}
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
	
	//check result
	private boolean checkResult(BookStoreDto dto) {
		if(dto == null || dto.getMessage().contains("failed")) {
			loginSucceed = false;
		} else {
			loginSucceed = true;
		}
		
		return loginSucceed;
	}
	
	//dto getter
	public BookStoreDto getBookStoreDto() {
		return dto;
	}
	
}
