package bookStore.dto;
/**
 * book store dto 
 * super dto for all subordinate dto
 * @author acmil
 *
 */
public class BookStoreDto {
	
	//userId
	private String userId;
	//userName
	private String userName;
	//userType
	private int userType;
	//Password
	private String password;
	//userVersion
	private int userVersion;
	
	//constructor
	public BookStoreDto() {
		//used when server just started
	}
	
	//constructor
	public BookStoreDto(String userId, String userName, int userType, String password, int userVersion) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.password = password;
		this.userVersion = userVersion;
	}

	//getter&setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserVersion() {
		return userVersion;
	}
	public void setUserVersion(int userVersion) {
		this.userVersion = userVersion;
	}
}
