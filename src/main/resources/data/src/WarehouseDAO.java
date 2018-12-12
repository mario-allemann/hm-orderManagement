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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class WarehouseDAO {
	public static Warehouse loadWarehouseByORMID(int placeID) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadWarehouseByORMID(session, placeID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse getWarehouseByORMID(int placeID) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getWarehouseByORMID(session, placeID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByORMID(int placeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadWarehouseByORMID(session, placeID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse getWarehouseByORMID(int placeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getWarehouseByORMID(session, placeID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByORMID(PersistentSession session, int placeID) throws PersistentException {
		try {
			return (Warehouse) session.load(Warehouse.class, new Integer(placeID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse getWarehouseByORMID(PersistentSession session, int placeID) throws PersistentException {
		try {
			return (Warehouse) session.get(Warehouse.class, new Integer(placeID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByORMID(PersistentSession session, int placeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Warehouse) session.load(Warehouse.class, new Integer(placeID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse getWarehouseByORMID(PersistentSession session, int placeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Warehouse) session.get(Warehouse.class, new Integer(placeID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWarehouse(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryWarehouse(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWarehouse(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryWarehouse(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse[] listWarehouseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listWarehouseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse[] listWarehouseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listWarehouseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWarehouse(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Warehouse as Warehouse");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWarehouse(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Warehouse as Warehouse");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Warehouse", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse[] listWarehouseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryWarehouse(session, condition, orderBy);
			return (Warehouse[]) list.toArray(new Warehouse[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse[] listWarehouseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryWarehouse(session, condition, orderBy, lockMode);
			return (Warehouse[]) list.toArray(new Warehouse[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadWarehouseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadWarehouseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Warehouse[] warehouses = listWarehouseByQuery(session, condition, orderBy);
		if (warehouses != null && warehouses.length > 0)
			return warehouses[0];
		else
			return null;
	}
	
	public static Warehouse loadWarehouseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Warehouse[] warehouses = listWarehouseByQuery(session, condition, orderBy, lockMode);
		if (warehouses != null && warehouses.length > 0)
			return warehouses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateWarehouseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iterateWarehouseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWarehouseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iterateWarehouseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWarehouseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Warehouse as Warehouse");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWarehouseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Warehouse as Warehouse");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Warehouse", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse createWarehouse() {
		return new Warehouse();
	}
	
	public static boolean save(Warehouse warehouse) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().saveObject(warehouse);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Warehouse warehouse) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().deleteObject(warehouse);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Warehouse warehouse) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().refresh(warehouse);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Warehouse warehouse) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().evict(warehouse);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Warehouse loadWarehouseByCriteria(WarehouseCriteria warehouseCriteria) {
		Warehouse[] warehouses = listWarehouseByCriteria(warehouseCriteria);
		if(warehouses == null || warehouses.length == 0) {
			return null;
		}
		return warehouses[0];
	}
	
	public static Warehouse[] listWarehouseByCriteria(WarehouseCriteria warehouseCriteria) {
		return warehouseCriteria.listWarehouse();
	}
}
