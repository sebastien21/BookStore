package bookStore.server;

import bookStore.dao.UserDaoImp;
import bookStore.dto.BookStoreDto;
import bookStore.entity.User;
import bookStore.util.CommandType;

/**
 * server user controller
 * @author acmil
 *
 */
public class BookStoreServerUserController {
	
	//user dao
	private UserDaoImp dao;
	
	//constructor
	public BookStoreServerUserController() {
		this.dao = new UserDaoImp();
	}
	
	//user process
	public BookStoreDto userProcess(CommandType command, BookStoreDto dto) throws ClassNotFoundException {
		switch(command) {
			case LOGIN:
				
				User loginUser = dao.getOneUserByUserId(dto.getUserName());
				
				if(loginUser != null && dto.getPassword().equals(loginUser.getPassword())) { 
					dto.setUserType(loginUser.getType());
					dto.setMessage(dto.getUserName() + ": login succeed");
				} else {
					dto = null;
				}
				return dto;
			case LOGOUT:
				//TBD not yet
				return null;
			case REGISTERUSER:
				User userToRegister = new User(dto.getUserId(), 
						dto.getUserName(), dto.getUserType(), dto.getPassword());
				if(dao.registerUser(userToRegister)) {
					dto.setMessage("register succeeded");
				} else {
					dto.setMessage("register failed");
				}
				return dto;					
			default:
				//unrecognized command
				return null;
		}
	}
}
