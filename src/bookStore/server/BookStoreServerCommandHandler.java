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
	public void start(CommandType command, BookStoreDto dto) throws ClassNotFoundException {
		this.user = new BookStoreServerUserController();
		user.userProcess(command, dto);
	}
	
	//process
	public void process(CommandType command, BookStoreDto dto) throws ClassNotFoundException {
		switch (command){
			case LOGIN:
				//server user controller
				break;
			case LOGOUT:
				//server user controller
				break;
			case REGISTERUSER:
				//server user controller
				user.userProcess(command, dto);
				break;
			default:
				//TBD more function and error handling code
				break;
		}
	}
}
