package bookStore.dao;

import java.util.HashMap;

import bookStore.entity.User;

/**
 * user dao interface
 * @author acmil
 *
 */
public interface UserDao {
	
	//register a new user, succeed - true; fail - false
	public boolean registerUser(User user) throws ClassNotFoundException;
	
	//update user information(password only for now), succeed - true; fail - false
	public boolean updateUser(User user);
	
	//delete user, succeed - true; fail - false
	//only available to admin user
	public boolean deleteUser(String id);
	
	//get all user
	public HashMap<String,User> getAll();

	//get one exact user by name
	public User getOneUserByName(String name);

	//get one exact user by id
	public User getOneUserById(String id);
}
