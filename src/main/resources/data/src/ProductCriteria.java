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

public class ProductCriteria extends AbstractORMCriteria {
	public final IntegerExpression prodId;
	public final IntegerExpression price;
	public final StringExpression productName;
	public final StringExpression description;
	public final CollectionExpression orderPositions;
	
	public ProductCriteria(Criteria criteria) {
		super(criteria);
		prodId = new IntegerExpression("prodId", this);
		price = new IntegerExpression("price", this);
		productName = new StringExpression("productName", this);
		description = new StringExpression("description", this);
		orderPositions = new CollectionExpression("ORM_OrderPositions", this);
	}
	
	public ProductCriteria(PersistentSession session) {
		this(session.createCriteria(Product.class));
	}
	
	public ProductCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public OrderPositionsCriteria createOrderPositionsCriteria() {
		return new OrderPositionsCriteria(createCriteria("ORM_OrderPositions"));
	}
	
	public Product uniqueProduct() {
		return (Product) super.uniqueResult();
	}
	
	public Product[] listProduct() {
		java.util.List list = super.list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

