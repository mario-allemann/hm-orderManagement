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
public class Product {
	public Product() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PRODUCT_ORDERPOSITIONS) {
			return ORM_orderPositions;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int prodId;
	
	private int price;
	
	private String productName;
	
	private String description;
	
	private java.util.Set ORM_orderPositions = new java.util.HashSet();
	
	private void setProdId(int value) {
		this.prodId = value;
	}
	
	public int getProdId() {
		return prodId;
	}
	
	public int getORMID() {
		return getProdId();
	}
	
	public void setPrice(int value) {
		this.price = value;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setProductName(String value) {
		this.productName = value;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	private void setORM_OrderPositions(java.util.Set value) {
		this.ORM_orderPositions = value;
	}
	
	private java.util.Set getORM_OrderPositions() {
		return ORM_orderPositions;
	}
	
	public final OrderPositionsSetCollection orderPositions = new OrderPositionsSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCT_ORDERPOSITIONS, ORMConstants.KEY_ORDERPOSITIONS_PRODUCT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getProdId());
	}
	
}
