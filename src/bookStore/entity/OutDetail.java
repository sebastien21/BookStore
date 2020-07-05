package bookStore.entity;

import java.math.BigDecimal;

/**
 * Out Detail entity
 * @author acmil
 *
 */
public class OutDetail {
	
	//ID
	private String id;
	//Out Id
	private String outId;
	//Book Id
	private String bookId;
	//Out Number
	private int sumNum;
	//Out Money
	private BigDecimal outMoney;
	
	//Constructor
	public OutDetail(String id, String outId, String bookId, int sumNum, BigDecimal outMoney) {
		this.id = id;
		this.outId = outId;
		this.bookId = bookId;
		this.sumNum = sumNum;
		this.outMoney = outMoney;
	}
	
	//id getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//Out id getter&setter
	public String getoutId() {
		return outId;
	}
	public void setoutId(String outId) {
		this.outId = outId;
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
	//out Money getter&setter
	public BigDecimal getoutMoney() {
		return outMoney;
	}
	public void setoutMoney(BigDecimal outMoney) {
		this.outMoney = outMoney;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((outId == null) ? 0 : outId.hashCode());
		result = prime * result + ((outMoney == null) ? 0 : outMoney.hashCode());
		result = prime * result + sumNum;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OutDetail other = (OutDetail) obj;
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
		if (outId == null) {
			if (other.outId != null)
				return false;
		} else if (!outId.equals(other.outId))
			return false;
		if (outMoney == null) {
			if (other.outMoney != null)
				return false;
		} else if (!outMoney.equals(other.outMoney))
			return false;
		if (sumNum != other.sumNum)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OutDetail [id=" + id + ", outId=" + outId + ", bookId=" + bookId + ", sumNum=" + sumNum + ", outMoney="
				+ outMoney + ", getId()=" + getId() + ", getoutId()=" + getoutId() + ", getBookId()=" + getBookId()
				+ ", getSumNum()=" + getSumNum() + ", getoutMoney()=" + getoutMoney() + "]";
	}
	
}
