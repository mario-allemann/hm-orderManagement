/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Mario Allemann(FHNW University of Applied Sciences Northwestern Switzerland)
 * License Type: Academic
 */
public class OrderPositions {
	public OrderPositions() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ORDERPOSITIONS_ORDER) {
			this.order = (Order) owner;
		}
		
		else if (key == ORMConstants.KEY_ORDERPOSITIONS_PRODUCT) {
			this.product = (Product) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int posId;
	
	private Order order;
	
	private Product product;
	
	private int qty;
	
	private void setPosId(int value) {
		this.posId = value;
	}
	
	public int getPosId() {
		return posId;
	}
	
	public int getORMID() {
		return getPosId();
	}
	
	public void setQty(int value) {
		this.qty = value;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setOrder(Order value) {
		if (order != null) {
			order.orderPositions.remove(this);
		}
		if (value != null) {
			value.orderPositions.add(this);
		}
	}
	
	public Order getOrder() {
		return order;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Order(Order value) {
		this.order = value;
	}
	
	private Order getORM_Order() {
		return order;
	}
	
	public void setProduct(Product value) {
		if (product != null) {
			product.orderPositions.remove(this);
		}
		if (value != null) {
			value.orderPositions.add(this);
		}
	}
	
	public Product getProduct() {
		return product;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Product(Product value) {
		this.product = value;
	}
	
	private Product getORM_Product() {
		return product;
	}
	
	public String toString() {
		return String.valueOf(getPosId());
	}
	
}
