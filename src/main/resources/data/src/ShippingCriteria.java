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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ShippingCriteria extends AbstractORMCriteria {
	public final IntegerExpression trackingId;
	public final DateExpression estimatedDate;
	public final DateExpression effectiveDate;
	public final IntegerExpression orderId;
	
	public ShippingCriteria(Criteria criteria) {
		super(criteria);
		trackingId = new IntegerExpression("trackingId", this);
		estimatedDate = new DateExpression("estimatedDate", this);
		effectiveDate = new DateExpression("effectiveDate", this);
		orderId = new IntegerExpression("orderId", this);
	}
	
	public ShippingCriteria(PersistentSession session) {
		this(session.createCriteria(Shipping.class));
	}
	
	public ShippingCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public Shipping uniqueShipping() {
		return (Shipping) super.uniqueResult();
	}
	
	public Shipping[] listShipping() {
		java.util.List list = super.list();
		return (Shipping[]) list.toArray(new Shipping[list.size()]);
	}
}

