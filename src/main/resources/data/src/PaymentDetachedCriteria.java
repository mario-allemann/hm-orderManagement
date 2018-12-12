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

public class PaymentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression transactionID;
	public final IntegerExpression amount;
	public final IntegerExpression orderId;
	public final DateExpression payDate;
	
	public PaymentDetachedCriteria() {
		super(Payment.class, PaymentCriteria.class);
		transactionID = new IntegerExpression("transactionID", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		orderId = new IntegerExpression("orderId", this.getDetachedCriteria());
		payDate = new DateExpression("payDate", this.getDetachedCriteria());
	}
	
	public PaymentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PaymentCriteria.class);
		transactionID = new IntegerExpression("transactionID", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		orderId = new IntegerExpression("orderId", this.getDetachedCriteria());
		payDate = new DateExpression("payDate", this.getDetachedCriteria());
	}
	
	public Payment uniquePayment(PersistentSession session) {
		return (Payment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Payment[] listPayment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Payment[]) list.toArray(new Payment[list.size()]);
	}
}

