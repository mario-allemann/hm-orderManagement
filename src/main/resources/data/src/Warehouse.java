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
public class Warehouse {
	public Warehouse() {
	}
	
	private int placeID;
	
	private int amount;
	
	private int prodId;
	
	private void setPlaceID(int value) {
		this.placeID = value;
	}
	
	public int getPlaceID() {
		return placeID;
	}
	
	public int getORMID() {
		return getPlaceID();
	}
	
	public void setAmount(int value) {
		this.amount = value;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setProdId(int value) {
		this.prodId = value;
	}
	
	public int getProdId() {
		return prodId;
	}
	
	public String toString() {
		return String.valueOf(getPlaceID());
	}
	
}
