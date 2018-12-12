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

public class CustomerCriteria extends AbstractORMCriteria {
	public final IntegerExpression customerId;
	public final StringExpression lastname;
	public final StringExpression firstname;
	public final StringExpression address;
	public final IntegerExpression zip;
	public final StringExpression city;
	public final IntegerExpression loyalityPts_int;
	public final CollectionExpression order;
	
	public CustomerCriteria(Criteria criteria) {
		super(criteria);
		customerId = new IntegerExpression("customerId", this);
		lastname = new StringExpression("lastname", this);
		firstname = new StringExpression("firstname", this);
		address = new StringExpression("address", this);
		zip = new IntegerExpression("zip", this);
		city = new StringExpression("city", this);
		loyalityPts_int = new IntegerExpression("loyalityPts_int", this);
		order = new CollectionExpression("ORM_Order", this);
	}
	
	public CustomerCriteria(PersistentSession session) {
		this(session.createCriteria(Customer.class));
	}
	
	public CustomerCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public OrderCriteria createOrderCriteria() {
		return new OrderCriteria(createCriteria("ORM_Order"));
	}
	
	public Customer uniqueCustomer() {
		return (Customer) super.uniqueResult();
	}
	
	public Customer[] listCustomer() {
		java.util.List list = super.list();
		return (Customer[]) list.toArray(new Customer[list.size()]);
	}
}

