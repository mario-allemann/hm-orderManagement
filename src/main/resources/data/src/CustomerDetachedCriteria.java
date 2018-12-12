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

public class CustomerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression customerId;
	public final StringExpression lastname;
	public final StringExpression firstname;
	public final StringExpression address;
	public final IntegerExpression zip;
	public final StringExpression city;
	public final IntegerExpression loyalityPts_int;
	public final CollectionExpression order;
	
	public CustomerDetachedCriteria() {
		super(Customer.class, CustomerCriteria.class);
		customerId = new IntegerExpression("customerId", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		zip = new IntegerExpression("zip", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		loyalityPts_int = new IntegerExpression("loyalityPts_int", this.getDetachedCriteria());
		order = new CollectionExpression("ORM_Order", this.getDetachedCriteria());
	}
	
	public CustomerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CustomerCriteria.class);
		customerId = new IntegerExpression("customerId", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		zip = new IntegerExpression("zip", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		loyalityPts_int = new IntegerExpression("loyalityPts_int", this.getDetachedCriteria());
		order = new CollectionExpression("ORM_Order", this.getDetachedCriteria());
	}
	
	public OrderDetachedCriteria createOrderCriteria() {
		return new OrderDetachedCriteria(createCriteria("ORM_Order"));
	}
	
	public Customer uniqueCustomer(PersistentSession session) {
		return (Customer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Customer[] listCustomer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Customer[]) list.toArray(new Customer[list.size()]);
	}
}

