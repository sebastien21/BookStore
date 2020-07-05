package bookStore.server;

import bookStore.dao.UserDaoImp;
import bookStore.dto.BookStoreDto;
import bookStore.entity.User;
import bookStore.util.ClientUiUtil;
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
	public void userProcess(CommandType command, BookStoreDto dto) throws ClassNotFoundException {
		switch(command) {
			case LOGIN:
				//TBD not yet
				break;
			case LOGOUT:
				//TBD not yet
				break;
			case REGISTERUSER:
				User userToRegister = new User(dto.getUserId(), 
						dto.getUserName(), dto.getUserType(), dto.getPassword());
				if(dao.registerUser(userToRegister)) {
					ClientUiUtil.systemOut("register succeeded");
				} else {
					ClientUiUtil.systemOut("register failed");
				}
					
				break;
			default:
				//unrecognized command
				break;
		}
	}
}
