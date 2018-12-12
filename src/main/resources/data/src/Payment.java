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
public class Payment {
	public Payment() {
	}
	
	private int transactionID;
	
	private Integer amount;
	
	private int orderId;
	
	private java.util.Date payDate;
	
	private void setTransactionID(int value) {
		this.transactionID = value;
	}
	
	public int getTransactionID() {
		return transactionID;
	}
	
	public int getORMID() {
		return getTransactionID();
	}
	
	public void setAmount(int value) {
		setAmount(new Integer(value));
	}
	
	public void setAmount(Integer value) {
		this.amount = value;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setOrderId(int value) {
		this.orderId = value;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setPayDate(java.util.Date value) {
		this.payDate = value;
	}
	
	public java.util.Date getPayDate() {
		return payDate;
	}
	
	private Integer loyaltyPoints;
	
	public String toString() {
		return String.valueOf(getTransactionID());
	}
	
}
