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

public class OrderPositionsDAO {
	public static OrderPositions loadOrderPositionsByORMID(int posId) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderPositionsByORMID(session, posId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions getOrderPositionsByORMID(int posId) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getOrderPositionsByORMID(session, posId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByORMID(int posId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderPositionsByORMID(session, posId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions getOrderPositionsByORMID(int posId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getOrderPositionsByORMID(session, posId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByORMID(PersistentSession session, int posId) throws PersistentException {
		try {
			return (OrderPositions) session.load(OrderPositions.class, new Integer(posId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions getOrderPositionsByORMID(PersistentSession session, int posId) throws PersistentException {
		try {
			return (OrderPositions) session.get(OrderPositions.class, new Integer(posId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByORMID(PersistentSession session, int posId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrderPositions) session.load(OrderPositions.class, new Integer(posId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions getOrderPositionsByORMID(PersistentSession session, int posId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrderPositions) session.get(OrderPositions.class, new Integer(posId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrderPositions(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryOrderPositions(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrderPositions(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryOrderPositions(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions[] listOrderPositionsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listOrderPositionsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions[] listOrderPositionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listOrderPositionsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrderPositions(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderPositions as OrderPositions");
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
	
	public static List queryOrderPositions(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderPositions as OrderPositions");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrderPositions", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions[] listOrderPositionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrderPositions(session, condition, orderBy);
			return (OrderPositions[]) list.toArray(new OrderPositions[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions[] listOrderPositionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrderPositions(session, condition, orderBy, lockMode);
			return (OrderPositions[]) list.toArray(new OrderPositions[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderPositionsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderPositionsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		OrderPositions[] orderPositionses = listOrderPositionsByQuery(session, condition, orderBy);
		if (orderPositionses != null && orderPositionses.length > 0)
			return orderPositionses[0];
		else
			return null;
	}
	
	public static OrderPositions loadOrderPositionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		OrderPositions[] orderPositionses = listOrderPositionsByQuery(session, condition, orderBy, lockMode);
		if (orderPositionses != null && orderPositionses.length > 0)
			return orderPositionses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrderPositionsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iterateOrderPositionsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderPositionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iterateOrderPositionsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderPositionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderPositions as OrderPositions");
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
	
	public static java.util.Iterator iterateOrderPositionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderPositions as OrderPositions");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrderPositions", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions createOrderPositions() {
		return new OrderPositions();
	}
	
	public static boolean save(OrderPositions orderPositions) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().saveObject(orderPositions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(OrderPositions orderPositions) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().deleteObject(orderPositions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(OrderPositions orderPositions)throws PersistentException {
		try {
			if (orderPositions.getOrder() != null) {
				orderPositions.getOrder().orderPositions.remove(orderPositions);
			}
			
			if (orderPositions.getProduct() != null) {
				orderPositions.getProduct().orderPositions.remove(orderPositions);
			}
			
			return delete(orderPositions);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(OrderPositions orderPositions, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (orderPositions.getOrder() != null) {
				orderPositions.getOrder().orderPositions.remove(orderPositions);
			}
			
			if (orderPositions.getProduct() != null) {
				orderPositions.getProduct().orderPositions.remove(orderPositions);
			}
			
			try {
				session.delete(orderPositions);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(OrderPositions orderPositions) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().refresh(orderPositions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(OrderPositions orderPositions) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().evict(orderPositions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderPositions loadOrderPositionsByCriteria(OrderPositionsCriteria orderPositionsCriteria) {
		OrderPositions[] orderPositionses = listOrderPositionsByCriteria(orderPositionsCriteria);
		if(orderPositionses == null || orderPositionses.length == 0) {
			return null;
		}
		return orderPositionses[0];
	}
	
	public static OrderPositions[] listOrderPositionsByCriteria(OrderPositionsCriteria orderPositionsCriteria) {
		return orderPositionsCriteria.listOrderPositions();
	}
}
