package bookStore.entity;
/**
 * Storage entity
 * @author acmil
 *
 */
public class Storage {

	//ID
	private String id;
	//book id
	private String bookId;
	//storage number
	private int sumNum;

	//constructor
	public Storage(String id, String bookId, int sumNum) {
		this.id = id;
		this.bookId = bookId;
		this.sumNum = sumNum;
	}
	
	//id getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//book id getter&setter
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	//sum num getter&setter
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + sumNum;
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
		Storage other = (Storage) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sumNum != other.sumNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Storage [id=" + id + ", bookId=" + bookId + ", sumNum=" + sumNum + ", getId()=" + getId()
				+ ", getBookId()=" + getBookId() + ", getSumNum()=" + getSumNum() + "]";
	}
	
}
