package bookStore.server;

import java.util.Date;
import bookStore.util.CommandType;

/**
 * server starts
 * @author acmil
 *
 */
public class BookStoreServerMain {
	//connection message
	private String message;
	
	//constructor
	public BookStoreServerMain() {
	}
	
	//server initialization
	public void initialize(CommandType command) {
			message = "Server ready@ " + new Date().toString();
	}
	
	//server start message
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
