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

public class WarehouseCriteria extends AbstractORMCriteria {
	public final IntegerExpression placeID;
	public final IntegerExpression amount;
	public final IntegerExpression prodId;
	
	public WarehouseCriteria(Criteria criteria) {
		super(criteria);
		placeID = new IntegerExpression("placeID", this);
		amount = new IntegerExpression("amount", this);
		prodId = new IntegerExpression("prodId", this);
	}
	
	public WarehouseCriteria(PersistentSession session) {
		this(session.createCriteria(Warehouse.class));
	}
	
	public WarehouseCriteria() throws PersistentException {
		this(DomänenmodellPersistentManager.instance().getSession());
	}
	
	public Warehouse uniqueWarehouse() {
		return (Warehouse) super.uniqueResult();
	}
	
	public Warehouse[] listWarehouse() {
		java.util.List list = super.list();
		return (Warehouse[]) list.toArray(new Warehouse[list.size()]);
	}
}

