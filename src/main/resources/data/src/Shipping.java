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
public class Shipping {
	public Shipping() {
	}
	
	private int trackingId;
	
	private java.util.Date estimatedDate;
	
	private java.util.Date effectiveDate;
	
	private Integer orderId;
	
	private void setTrackingId(int value) {
		this.trackingId = value;
	}
	
	public int getTrackingId() {
		return trackingId;
	}
	
	public int getORMID() {
		return getTrackingId();
	}
	
	public void setEstimatedDate(java.util.Date value) {
		this.estimatedDate = value;
	}
	
	public java.util.Date getEstimatedDate() {
		return estimatedDate;
	}
	
	public void setEffectiveDate(java.util.Date value) {
		this.effectiveDate = value;
	}
	
	public java.util.Date getEffectiveDate() {
		return effectiveDate;
	}
	
	public void setOrderId(int value) {
		setOrderId(new Integer(value));
	}
	
	public void setOrderId(Integer value) {
		this.orderId = value;
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	
	public String toString() {
		return String.valueOf(getTrackingId());
	}
	
}
