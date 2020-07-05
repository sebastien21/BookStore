package bookStore.server;

import bookStore.dto.BookStoreDto;
import bookStore.util.CommandType;

/**
 * command handler
 * @author acmil
 *
 */
public class BookStoreServerCommandHandler {
	//user controller
	private BookStoreServerUserController user;
	
	//constructor
	public BookStoreServerCommandHandler() {
		//NOTHING TO DO HERE
	}
	
	//start
	public BookStoreDto start(CommandType command, BookStoreDto dto) throws ClassNotFoundException {
		this.user = new BookStoreServerUserController();
		return user.userProcess(command, dto);
	}
	
	//process
	public BookStoreDto process(CommandType command, BookStoreDto dto) throws ClassNotFoundException {
		switch (command){
			case LOGIN:
				//server user controller
				return user.userProcess(command, dto);
			case LOGOUT:
				//TODO :server user controller
				return null;
			case REGISTERUSER:
				//server user controller
				return user.userProcess(command, dto);
			default:
				//TBD more function and error handling code
				return null;
		}
	}
}
