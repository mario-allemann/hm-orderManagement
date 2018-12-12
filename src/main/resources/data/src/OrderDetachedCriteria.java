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

public class OrderDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression orderId;
	public final DateExpression date;
	public final StringExpression state;
	public final IntegerExpression customerId;
	public final AssociationExpression customer;
	public final CollectionExpression orderPositions;
	
	public OrderDetachedCriteria() {
		super(Order.class, OrderCriteria.class);
		orderId = new IntegerExpression("orderId", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		state = new StringExpression("state", this.getDetachedCriteria());
		customerId = new IntegerExpression("customer.customerId", this.getDetachedCriteria());
		customer = new AssociationExpression("customer", this.getDetachedCriteria());
		orderPositions = new CollectionExpression("ORM_OrderPositions", this.getDetachedCriteria());
	}
	
	public OrderDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, OrderCriteria.class);
		orderId = new IntegerExpression("orderId", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		state = new StringExpression("state", this.getDetachedCriteria());
		customerId = new IntegerExpression("customer.customerId", this.getDetachedCriteria());
		customer = new AssociationExpression("customer", this.getDetachedCriteria());
		orderPositions = new CollectionExpression("ORM_OrderPositions", this.getDetachedCriteria());
	}
	
	public CustomerDetachedCriteria createCustomerCriteria() {
		return new CustomerDetachedCriteria(createCriteria("customer"));
	}
	
	public OrderPositionsDetachedCriteria createOrderPositionsCriteria() {
		return new OrderPositionsDetachedCriteria(createCriteria("ORM_OrderPositions"));
	}
	
	public Order uniqueOrder(PersistentSession session) {
		return (Order) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Order[] listOrder(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Order[]) list.toArray(new Order[list.size()]);
	}
}

