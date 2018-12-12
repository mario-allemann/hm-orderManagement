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

public class OrderCriteria extends AbstractORMCriteria {
	public final IntegerExpression orderId;
	public final DateExpression date;
	public final StringExpression state;
	public final IntegerExpression customerId;
	public final AssociationExpression customer;
	public final CollectionExpression orderPositions;
	
	public OrderCriteria(Criteria criteria) {
		super(criteria);
		orderId = new IntegerExpression("orderId", this);
		date = new DateExpression("date", this);
		state = new StringExpression("state", this);
		customerId = new IntegerExpression("customer.customerId", this);
		customer = new AssociationExpression("customer", this);
		orderPositions = new CollectionExpression("ORM_OrderPositions", this);
	}
	
	public OrderCriteria(PersistentSession session) {
		this(session.createCriteria(Order.class));
	}
	
	public OrderCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public CustomerCriteria createCustomerCriteria() {
		return new CustomerCriteria(createCriteria("customer"));
	}
	
	public OrderPositionsCriteria createOrderPositionsCriteria() {
		return new OrderPositionsCriteria(createCriteria("ORM_OrderPositions"));
	}
	
	public Order uniqueOrder() {
		return (Order) super.uniqueResult();
	}
	
	public Order[] listOrder() {
		java.util.List list = super.list();
		return (Order[]) list.toArray(new Order[list.size()]);
	}
}

