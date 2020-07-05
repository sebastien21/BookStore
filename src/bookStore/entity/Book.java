package bookStore.entity;

import java.math.BigDecimal;

/**
 * Book entity
 * @author acmil
 *
 */
public class Book {

	//ID
	private String id;
	//Name
	private String name;
	//inPrice
	private BigDecimal inPrice;
	//salesPrice
	private BigDecimal salesPrice;
	
	//Constructor
	public Book(String id, String name, BigDecimal inPrice, BigDecimal salesPrice) {
		this.id = id;
		this.name = name;
		this.inPrice = inPrice;
		this.salesPrice = salesPrice;
	}
	
	//ID getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//Name getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//InPrice getter&setter
	public BigDecimal getInPrice() {
		return inPrice;
	}
	public void setInPrice(BigDecimal inPrice) {
		this.inPrice = inPrice;
	}
	
	//SalesPrice getter&setter
	public BigDecimal getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inPrice == null) ? 0 : inPrice.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salesPrice == null) ? 0 : salesPrice.hashCode());
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
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inPrice == null) {
			if (other.inPrice != null)
				return false;
		} else if (!inPrice.equals(other.inPrice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salesPrice == null) {
			if (other.salesPrice != null)
				return false;
		} else if (!salesPrice.equals(other.salesPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", inPrice=" + inPrice + ", salesPrice=" + salesPrice
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getInPrice()=" + getInPrice()
				+ ", getSalesPrice()=" + getSalesPrice() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
