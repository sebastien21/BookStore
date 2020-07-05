package bookStore.entity;
/**
 * In Storage entity
 * @author acmil
 *
 */
		
public class InStorage {
	
	//ID
	private String id;
	//In Date  
	private String inDate;
	//In User Id
	private String inUserId;
	
	//Constructor
	public InStorage(String id, String inDate, String inUserId) {
		this.id = id;
		this.inDate = inDate;
		this.inUserId = inUserId;
	}
	
	//ID getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//InDate getter&setter
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	//InUserID getter&setter
	public String getInUserId() {
		return inUserId;
	}
	public void setInUserId(String inUserId) {
		this.inUserId = inUserId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inDate == null) ? 0 : inDate.hashCode());
		result = prime * result + ((inUserId == null) ? 0 : inUserId.hashCode());
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
		InStorage other = (InStorage) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inDate == null) {
			if (other.inDate != null)
				return false;
		} else if (!inDate.equals(other.inDate))
			return false;
		if (inUserId == null) {
			if (other.inUserId != null)
				return false;
		} else if (!inUserId.equals(other.inUserId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InStorage [id=" + id + ", inDate=" + inDate + ", inUserId=" + inUserId + ", getId()=" + getId()
				+ ", getInDate()=" + getInDate() + ", getInUserId()=" + getInUserId() + "]";
	}
	
}
