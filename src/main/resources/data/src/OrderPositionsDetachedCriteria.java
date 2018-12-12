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

public class OrderPositionsDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression posId;
	public final IntegerExpression orderId;
	public final AssociationExpression order;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	public final IntegerExpression qty;
	
	public OrderPositionsDetachedCriteria() {
		super(OrderPositions.class, OrderPositionsCriteria.class);
		posId = new IntegerExpression("posId", this.getDetachedCriteria());
		orderId = new IntegerExpression("order.orderId", this.getDetachedCriteria());
		order = new AssociationExpression("order", this.getDetachedCriteria());
		productId = new IntegerExpression("product.prodId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		qty = new IntegerExpression("qty", this.getDetachedCriteria());
	}
	
	public OrderPositionsDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, OrderPositionsCriteria.class);
		posId = new IntegerExpression("posId", this.getDetachedCriteria());
		orderId = new IntegerExpression("order.orderId", this.getDetachedCriteria());
		order = new AssociationExpression("order", this.getDetachedCriteria());
		productId = new IntegerExpression("product.prodId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		qty = new IntegerExpression("qty", this.getDetachedCriteria());
	}
	
	public OrderDetachedCriteria createOrderCriteria() {
		return new OrderDetachedCriteria(createCriteria("order"));
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public OrderPositions uniqueOrderPositions(PersistentSession session) {
		return (OrderPositions) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public OrderPositions[] listOrderPositions(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (OrderPositions[]) list.toArray(new OrderPositions[list.size()]);
	}
}

