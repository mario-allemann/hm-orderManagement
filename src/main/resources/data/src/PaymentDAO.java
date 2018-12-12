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

public class PaymentDAO {
	public static Payment loadPaymentByORMID(int transactionID) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadPaymentByORMID(session, transactionID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(int transactionID) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getPaymentByORMID(session, transactionID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByORMID(int transactionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadPaymentByORMID(session, transactionID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(int transactionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return getPaymentByORMID(session, transactionID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByORMID(PersistentSession session, int transactionID) throws PersistentException {
		try {
			return (Payment) session.load(Payment.class, new Integer(transactionID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(PersistentSession session, int transactionID) throws PersistentException {
		try {
			return (Payment) session.get(Payment.class, new Integer(transactionID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByORMID(PersistentSession session, int transactionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Payment) session.load(Payment.class, new Integer(transactionID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(PersistentSession session, int transactionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Payment) session.get(Payment.class, new Integer(transactionID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryPayment(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return queryPayment(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listPaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return listPaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Payment as Payment");
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
	
	public static List queryPayment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Payment as Payment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Payment", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPayment(session, condition, orderBy);
			return (Payment[]) list.toArray(new Payment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPayment(session, condition, orderBy, lockMode);
			return (Payment[]) list.toArray(new Payment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadPaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return loadPaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Payment[] payments = listPaymentByQuery(session, condition, orderBy);
		if (payments != null && payments.length > 0)
			return payments[0];
		else
			return null;
	}
	
	public static Payment loadPaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Payment[] payments = listPaymentByQuery(session, condition, orderBy, lockMode);
		if (payments != null && payments.length > 0)
			return payments[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iteratePaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = DomänenmodellPersistentManager.instance().getSession();
			return iteratePaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Payment as Payment");
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
	
	public static java.util.Iterator iteratePaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Payment as Payment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Payment", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment createPayment() {
		return new Payment();
	}
	
	public static boolean save(Payment payment) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().saveObject(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Payment payment) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().deleteObject(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Payment payment) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().refresh(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Payment payment) throws PersistentException {
		try {
			DomänenmodellPersistentManager.instance().getSession().evict(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByCriteria(PaymentCriteria paymentCriteria) {
		Payment[] payments = listPaymentByCriteria(paymentCriteria);
		if(payments == null || payments.length == 0) {
			return null;
		}
		return payments[0];
	}
	
	public static Payment[] listPaymentByCriteria(PaymentCriteria paymentCriteria) {
		return paymentCriteria.listPayment();
	}
}
