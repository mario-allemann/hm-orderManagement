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
public class Order {
	public Order() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ORDER_ORDERPOSITIONS) {
			return ORM_orderPositions;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ORDER_CUSTOMER) {
			this.customer = (Customer) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int orderId;
	
	private java.util.Date date;
	
	private String state;
	
	private Customer customer;
	
	private java.util.Set ORM_orderPositions = new java.util.HashSet();
	
	private void setOrderId(int value) {
		this.orderId = value;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public int getORMID() {
		return getOrderId();
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCustomer(Customer value) {
		if (customer != null) {
			customer.order.remove(this);
		}
		if (value != null) {
			value.order.add(this);
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Customer(Customer value) {
		this.customer = value;
	}
	
	private Customer getORM_Customer() {
		return customer;
	}
	
	private void setORM_OrderPositions(java.util.Set value) {
		this.ORM_orderPositions = value;
	}
	
	private java.util.Set getORM_OrderPositions() {
		return ORM_orderPositions;
	}
	
	public final OrderPositionsSetCollection orderPositions = new OrderPositionsSetCollection(this, _ormAdapter, ORMConstants.KEY_ORDER_ORDERPOSITIONS, ORMConstants.KEY_ORDERPOSITIONS_ORDER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getOrderId());
	}
	
}
