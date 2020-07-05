package bookStore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;

import bookStore.entity.User;
import bookStore.util.ClientUiUtil;

public class UserDaoImp implements UserDao {
	//max id for user table
	private String maxId;
	
	//constructor
	public UserDaoImp() {
		//nothing to do here
	}
	
	//get max id
	private String getMaxId() throws ClassNotFoundException {
		try {
			//connect db
		    Connection db = DriverManager.getConnection("jdbc:mysql://localhost/bookstore", "root", "rootliu");
		    
			String getMaxIdSql = "SELECT MAX(ID) AS maxid FROM USER";
			PreparedStatement stm = db.prepareStatement(getMaxIdSql);
			ResultSet rs = stm.executeQuery();
			String maxid = null;
			while(rs.next()) {
				maxid = rs.getString("maxid");
			}
			int max = Integer.parseInt(maxid) + 1;
			this.maxId = String.valueOf(max);
			stm.close();
			rs.close();
			db.close();
			return maxId;
		} catch(SQLException sql) {
			return "-1";
		}
		
	}
	
	@Override
	public boolean registerUser(User user) throws ClassNotFoundException {
		String insert = "INSERT INTO USER "
				+ "(ID, "
				+ "NAME, "
				+ "TYPE, "
				+ "PASSWORD, "
				+ "VERSION, "
				+ "CREATED_USER, "
				+ "CREATED_DATE, "
				+ "MODIFIED_USER, "
				+ "MODIFIED_DATE) "
				+ "VALUES (?,?,?,?,?,?,?,?,?)";
		user.setId(getMaxId());
		try {
			//connect db
		    Connection db = DriverManager.getConnection("jdbc:mysql://localhost/BOOK_STORE_DB", "root", "sebastienliu1992");
		    db.setAutoCommit(false);
			
			PreparedStatement stm = db.prepareStatement(insert);
			stm.setString(1, user.getId());
			stm.setString(2, user.getName());
			stm.setInt(3, user.getType());
			stm.setString(4, user.getPassword());
			stm.setInt(5, 0);
			stm.setString(6, "System");
			stm.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			stm.setString(8, "System");
			stm.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
			System.out.println(stm.toString());
			int insertResult = stm.executeUpdate();
			if(insertResult != 0) {
				db.commit();
				stm.close();
				db.close();
				return true;
			} else {
				db.rollback();
				stm.close();
				db.close();
				return false;
			}
		} catch(SQLException sql) {
			sql.printStackTrace();
			ClientUiUtil.systemOut("SQL failed");
			return false;	
		}
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashMap<String, User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getOneUserByUserId(String userId) {
		String select = "SELECT ID, "+ 
				"NAME, " + 
				"TYPE, " + 
				"PASSWORD, " + 
				"VERSION FROM USER WHERE NAME = ?";
		try {
			//connect db
		    Connection db = DriverManager.getConnection("jdbc:mysql://localhost/BOOK_STORE_DB", "root", "sebastienliu1992");
		    db.setAutoCommit(false);
			
			PreparedStatement stm = db.prepareStatement(select);
			stm.setString(1, userId);
			System.out.println(stm.toString());
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				int type = rs.getInt(3);
				String password = rs.getString(4);
				User user = new User(id, name, type, password);
				return user;
			}
			return null;
		} catch(SQLException sql) {
			sql.printStackTrace();
			ClientUiUtil.systemOut("SQL failed");
			return null;
		}
	
	}

	@Override
	public User getOneUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
