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

public class OrderPositionsCriteria extends AbstractORMCriteria {
	public final IntegerExpression posId;
	public final IntegerExpression orderId;
	public final AssociationExpression order;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	public final IntegerExpression qty;
	
	public OrderPositionsCriteria(Criteria criteria) {
		super(criteria);
		posId = new IntegerExpression("posId", this);
		orderId = new IntegerExpression("order.orderId", this);
		order = new AssociationExpression("order", this);
		productId = new IntegerExpression("product.prodId", this);
		product = new AssociationExpression("product", this);
		qty = new IntegerExpression("qty", this);
	}
	
	public OrderPositionsCriteria(PersistentSession session) {
		this(session.createCriteria(OrderPositions.class));
	}
	
	public OrderPositionsCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public OrderCriteria createOrderCriteria() {
		return new OrderCriteria(createCriteria("order"));
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("product"));
	}
	
	public OrderPositions uniqueOrderPositions() {
		return (OrderPositions) super.uniqueResult();
	}
	
	public OrderPositions[] listOrderPositions() {
		java.util.List list = super.list();
		return (OrderPositions[]) list.toArray(new OrderPositions[list.size()]);
	}
}

