package bookStore.entity;
/**
 * User entity
 * @author acmil
 *
 */
public class User {

	//ID
	private String id;
	//Name
	private String name;
	//Type
	private int type;
	//Password
	private String password;
	//version
	private int version;
	
	//Constructor
	public User(String id, String name, int type, String pwd){
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = pwd;
	}
	
	//ID getter
	public String getId() {
		return this.id;
	}
	//ID setter
	public void setId(String id) {
		this.id = id;
	}
	
	//Name getter
	public String getName() {
		return this.name;
	}
	//Name setter
	public void setName(String name) {
		this.name = name;
	}
	
	//Type getter
	public int getType(){
		return this.type;
	}
	/*
	 * Type setter
	 * 1: admin
	 * 2: book info manager
	 * 3: storage manager
	 * 4: sale manager
	 * 
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	//Password getter
	public String getPassword() {
		return this.password;
	}
	//Password setter
	public void setPassword(String password) {
		this.password = password;
	}

	//user version 	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPassword()=" + getPassword()
				+ "]";
	}
}
