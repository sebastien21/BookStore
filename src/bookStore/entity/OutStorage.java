package bookStore.entity;
/**
 * Out Storage entity
 * @author acmil
 *
 */
		
public class OutStorage {
	
	//ID
	private String id;
	//In Date  
	private String outDate;
	//In User Id
	private String outUserId;
	
	//Constructor
	public OutStorage(String id, String outDate, String outUserId) {
		this.id = id;
		this.outDate = outDate;
		this.outUserId = outUserId;
	}
	
	//ID getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//outDate getter&setter
	public String getoutDate() {
		return outDate;
	}
	public void setoutDate(String outDate) {
		this.outDate = outDate;
	}
	//outUserId getter&setter
	public String getoutUserId() {
		return outUserId;
	}
	public void setoutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((outDate == null) ? 0 : outDate.hashCode());
		result = prime * result + ((outUserId == null) ? 0 : outUserId.hashCode());
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
		OutStorage other = (OutStorage) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (outDate == null) {
			if (other.outDate != null)
				return false;
		} else if (!outDate.equals(other.outDate))
			return false;
		if (outUserId == null) {
			if (other.outUserId != null)
				return false;
		} else if (!outUserId.equals(other.outUserId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OutStorage [id=" + id + ", outDate=" + outDate + ", outUserId=" + outUserId + ", getId()=" + getId()
				+ ", getoutDate()=" + getoutDate() + ", getoutUserId()=" + getoutUserId() + "]";
	}
	
}
