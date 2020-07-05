package bookStore.entity;

import java.math.BigDecimal;

/**
 * In Detail entity
 * @author acmil
 *
 */
public class InDetail {
	
	//ID
	private String id;
	//In Id
	private String inId;
	//Book Id
	private String bookId;
	//In Number
	private int sumNum;
	//In Money
	private BigDecimal inMoney;
	
	//Constructor
	public InDetail(String id, String inId, String bookId, int sumNum, BigDecimal inMoney) {
		this.id = id;
		this.inId = inId;
		this.bookId = bookId;
		this.sumNum = sumNum;
		this.inMoney = inMoney;
	}
	
	//id getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//In id getter&setter
	public String getInId() {
		return inId;
	}
	public void setInId(String inId) {
		this.inId = inId;
	}
	//Book id getter&setter
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	//Sum Num getter&setter
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}
	//In Money getter&setter
	public BigDecimal getInMoney() {
		return inMoney;
	}
	public void setInMoney(BigDecimal inMoney) {
		this.inMoney = inMoney;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inId == null) ? 0 : inId.hashCode());
		result = prime * result + ((inMoney == null) ? 0 : inMoney.hashCode());
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
		InDetail other = (InDetail) obj;
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
		if (inId == null) {
			if (other.inId != null)
				return false;
		} else if (!inId.equals(other.inId))
			return false;
		if (inMoney == null) {
			if (other.inMoney != null)
				return false;
		} else if (!inMoney.equals(other.inMoney))
			return false;
		if (sumNum != other.sumNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InDetail [id=" + id + ", inId=" + inId + ", bookId=" + bookId + ", sumNum=" + sumNum + ", inMoney="
				+ inMoney + ", getId()=" + getId() + ", getInId()=" + getInId() + ", getBookId()=" + getBookId()
				+ ", getSumNum()=" + getSumNum() + ", getInMoney()=" + getInMoney() + "]";
	}
}
