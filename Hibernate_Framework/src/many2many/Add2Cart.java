package many2many;

import java.util.Set;

public class Add2Cart {
	private long id;
	private double total;

	private Set<ListofItems> items;
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<ListofItems> getItems() {
		return items;
	}

	public void setItems(Set<ListofItems> items) {
		this.items = items;
	}

}
