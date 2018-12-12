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
public class Customer {
	public Customer() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CUSTOMER_ORDER) {
			return ORM_order;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int customerId;
	
	private String lastname;
	
	private String firstname;
	
	private String address;
	
	private int zip;
	
	private String city;
	
	private int loyalityPts_int;
	
	private java.util.Set ORM_order = new java.util.HashSet();
	
	private void setCustomerId(int value) {
		this.customerId = value;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public int getORMID() {
		return getCustomerId();
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setZip(int value) {
		this.zip = value;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setLoyalityPts_int(int value) {
		this.loyalityPts_int = value;
	}
	
	public int getLoyalityPts_int() {
		return loyalityPts_int;
	}
	
	private void setORM_Order(java.util.Set value) {
		this.ORM_order = value;
	}
	
	private java.util.Set getORM_Order() {
		return ORM_order;
	}
	
	public final OrderSetCollection order = new OrderSetCollection(this, _ormAdapter, ORMConstants.KEY_CUSTOMER_ORDER, ORMConstants.KEY_ORDER_CUSTOMER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCustomerId());
	}
	
}
