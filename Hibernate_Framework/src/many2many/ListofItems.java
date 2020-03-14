package many2many;

import java.util.Set;

public class ListofItems {
	private long id;
	private double price;
	private String description;

	private Set<Add2Cart> carts;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Add2Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Add2Cart> carts) {
		this.carts = carts;
	}
}
