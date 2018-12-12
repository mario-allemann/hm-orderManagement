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

public class WarehouseDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression placeID;
	public final IntegerExpression amount;
	public final IntegerExpression prodId;
	
	public WarehouseDetachedCriteria() {
		super(Warehouse.class, WarehouseCriteria.class);
		placeID = new IntegerExpression("placeID", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		prodId = new IntegerExpression("prodId", this.getDetachedCriteria());
	}
	
	public WarehouseDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, WarehouseCriteria.class);
		placeID = new IntegerExpression("placeID", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		prodId = new IntegerExpression("prodId", this.getDetachedCriteria());
	}
	
	public Warehouse uniqueWarehouse(PersistentSession session) {
		return (Warehouse) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Warehouse[] listWarehouse(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Warehouse[]) list.toArray(new Warehouse[list.size()]);
	}
}

