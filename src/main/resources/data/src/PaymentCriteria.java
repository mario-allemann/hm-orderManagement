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

public class PaymentCriteria extends AbstractORMCriteria {
	public final IntegerExpression transactionID;
	public final IntegerExpression amount;
	public final IntegerExpression orderId;
	public final DateExpression payDate;
	
	public PaymentCriteria(Criteria criteria) {
		super(criteria);
		transactionID = new IntegerExpression("transactionID", this);
		amount = new IntegerExpression("amount", this);
		orderId = new IntegerExpression("orderId", this);
		payDate = new DateExpression("payDate", this);
	}
	
	public PaymentCriteria(PersistentSession session) {
		this(session.createCriteria(Payment.class));
	}
	
	public PaymentCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public Payment uniquePayment() {
		return (Payment) super.uniqueResult();
	}
	
	public Payment[] listPayment() {
		java.util.List list = super.list();
		return (Payment[]) list.toArray(new Payment[list.size()]);
	}
}

