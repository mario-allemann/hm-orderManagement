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

public class ProductDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression prodId;
	public final IntegerExpression price;
	public final StringExpression productName;
	public final StringExpression description;
	public final CollectionExpression orderPositions;
	
	public ProductDetachedCriteria() {
		super(Product.class, ProductCriteria.class);
		prodId = new IntegerExpression("prodId", this.getDetachedCriteria());
		price = new IntegerExpression("price", this.getDetachedCriteria());
		productName = new StringExpression("productName", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		orderPositions = new CollectionExpression("ORM_OrderPositions", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ProductCriteria.class);
		prodId = new IntegerExpression("prodId", this.getDetachedCriteria());
		price = new IntegerExpression("price", this.getDetachedCriteria());
		productName = new StringExpression("productName", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		orderPositions = new CollectionExpression("ORM_OrderPositions", this.getDetachedCriteria());
	}
	
	public OrderPositionsDetachedCriteria createOrderPositionsCriteria() {
		return new OrderPositionsDetachedCriteria(createCriteria("ORM_OrderPositions"));
	}
	
	public Product uniqueProduct(PersistentSession session) {
		return (Product) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Product[] listProduct(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

