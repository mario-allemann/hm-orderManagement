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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ShippingDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression trackingId;
	public final DateExpression estimatedDate;
	public final DateExpression effectiveDate;
	public final IntegerExpression orderId;
	
	public ShippingDetachedCriteria() {
		super(Shipping.class, ShippingCriteria.class);
		trackingId = new IntegerExpression("trackingId", this.getDetachedCriteria());
		estimatedDate = new DateExpression("estimatedDate", this.getDetachedCriteria());
		effectiveDate = new DateExpression("effectiveDate", this.getDetachedCriteria());
		orderId = new IntegerExpression("orderId", this.getDetachedCriteria());
	}
	
	public ShippingDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ShippingCriteria.class);
		trackingId = new IntegerExpression("trackingId", this.getDetachedCriteria());
		estimatedDate = new DateExpression("estimatedDate", this.getDetachedCriteria());
		effectiveDate = new DateExpression("effectiveDate", this.getDetachedCriteria());
		orderId = new IntegerExpression("orderId", this.getDetachedCriteria());
	}
	
	public Shipping uniqueShipping(PersistentSession session) {
		return (Shipping) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Shipping[] listShipping(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Shipping[]) list.toArray(new Shipping[list.size()]);
	}
}

