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

public class OrderDAO {
	public static Order loadOrderByORMID(int orderId) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(int orderId) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByORMID(int orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(int orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByORMID(PersistentSession session, int orderId) throws PersistentException {
		try {
			return (Order) session.load(Order.class, new Integer(orderId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(PersistentSession session, int orderId) throws PersistentException {
		try {
			return (Order) session.get(Order.class, new Integer(orderId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByORMID(PersistentSession session, int orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Order) session.load(Order.class, new Integer(orderId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(PersistentSession session, int orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Order) session.get(Order.class, new Integer(orderId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrder(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryOrder(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrder(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryOrder(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrder(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
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
	
	public static List queryOrder(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Order", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrder(session, condition, orderBy);
			return (Order[]) list.toArray(new Order[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrder(session, condition, orderBy, lockMode);
			return (Order[]) list.toArray(new Order[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Order[] orders = listOrderByQuery(session, condition, orderBy);
		if (orders != null && orders.length > 0)
			return orders[0];
		else
			return null;
	}
	
	public static Order loadOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Order[] orders = listOrderByQuery(session, condition, orderBy, lockMode);
		if (orders != null && orders.length > 0)
			return orders[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iterateOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iterateOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
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
	
	public static java.util.Iterator iterateOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Order", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order createOrder() {
		return new Order();
	}
	
	public static boolean save(Order order) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().saveObject(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Order order) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().deleteObject(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Order order)throws PersistentException {
		try {
			if (order.getCustomer() != null) {
				order.getCustomer().order.remove(order);
			}
			
			OrderPositions[] lOrderPositionss = order.orderPositions.toArray();
			for(int i = 0; i < lOrderPositionss.length; i++) {
				lOrderPositionss[i].setOrder(null);
			}
			return delete(order);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Order order, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (order.getCustomer() != null) {
				order.getCustomer().order.remove(order);
			}
			
			OrderPositions[] lOrderPositionss = order.orderPositions.toArray();
			for(int i = 0; i < lOrderPositionss.length; i++) {
				lOrderPositionss[i].setOrder(null);
			}
			try {
				session.delete(order);
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
	
	public static boolean refresh(Order order) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().refresh(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Order order) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().evict(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByCriteria(OrderCriteria orderCriteria) {
		Order[] orders = listOrderByCriteria(orderCriteria);
		if(orders == null || orders.length == 0) {
			return null;
		}
		return orders[0];
	}
	
	public static Order[] listOrderByCriteria(OrderCriteria orderCriteria) {
		return orderCriteria.listOrder();
	}
}
