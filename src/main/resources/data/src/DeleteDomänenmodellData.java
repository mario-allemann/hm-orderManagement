/**
 * Licensee: Mario Allemann(FHNW University of Applied Sciences Northwestern Switzerland)
 * License Type: Academic
 */
import org.orm.*;
public class DeleteDomänenmodellData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = DomänenmodellPersistentManager.instance().getSession().beginTransaction();
		try {
			Product product = ProductDAO.loadProductByQuery(null, null);
			// Delete the persistent object
			ProductDAO.delete(product);
			Payment payment = PaymentDAO.loadPaymentByQuery(null, null);
			// Delete the persistent object
			PaymentDAO.delete(payment);
			Warehouse warehouse = WarehouseDAO.loadWarehouseByQuery(null, null);
			// Delete the persistent object
			WarehouseDAO.delete(warehouse);
			Customer customer = CustomerDAO.loadCustomerByQuery(null, null);
			// Delete the persistent object
			CustomerDAO.delete(customer);
			Order order = OrderDAO.loadOrderByQuery(null, null);
			// Delete the persistent object
			OrderDAO.delete(order);
			OrderPositions orderPositions = OrderPositionsDAO.loadOrderPositionsByQuery(null, null);
			// Delete the persistent object
			OrderPositionsDAO.delete(orderPositions);
			Shipping shipping = ShippingDAO.loadShippingByQuery(null, null);
			// Delete the persistent object
			ShippingDAO.delete(shipping);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteDomänenmodellData deleteDomänenmodellData = new DeleteDomänenmodellData();
			try {
				deleteDomänenmodellData.deleteTestData();
			}
			finally {
				DomänenmodellPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
