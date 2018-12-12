/**
 * Licensee: Mario Allemann(FHNW University of Applied Sciences Northwestern Switzerland)
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateDomänenmodellData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = DomänenmodellPersistentManager.instance().getSession().beginTransaction();
		try {
			Product product = ProductDAO.loadProductByQuery(null, null);
			// Update the properties of the persistent object
			ProductDAO.save(product);
			Payment payment = PaymentDAO.loadPaymentByQuery(null, null);
			// Update the properties of the persistent object
			PaymentDAO.save(payment);
			Warehouse warehouse = WarehouseDAO.loadWarehouseByQuery(null, null);
			// Update the properties of the persistent object
			WarehouseDAO.save(warehouse);
			Customer customer = CustomerDAO.loadCustomerByQuery(null, null);
			// Update the properties of the persistent object
			CustomerDAO.save(customer);
			Order order = OrderDAO.loadOrderByQuery(null, null);
			// Update the properties of the persistent object
			OrderDAO.save(order);
			OrderPositions orderPositions = OrderPositionsDAO.loadOrderPositionsByQuery(null, null);
			// Update the properties of the persistent object
			OrderPositionsDAO.save(orderPositions);
			Shipping shipping = ShippingDAO.loadShippingByQuery(null, null);
			// Update the properties of the persistent object
			ShippingDAO.save(shipping);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Product by ProductCriteria");
		ProductCriteria productCriteria = new ProductCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//productCriteria.prodId.eq();
		System.out.println(productCriteria.uniqueProduct());
		
		System.out.println("Retrieving Payment by PaymentCriteria");
		PaymentCriteria paymentCriteria = new PaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//paymentCriteria.transactionID.eq();
		System.out.println(paymentCriteria.uniquePayment());
		
		System.out.println("Retrieving Warehouse by WarehouseCriteria");
		WarehouseCriteria warehouseCriteria = new WarehouseCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//warehouseCriteria.placeID.eq();
		System.out.println(warehouseCriteria.uniqueWarehouse());
		
		System.out.println("Retrieving Customer by CustomerCriteria");
		CustomerCriteria customerCriteria = new CustomerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//customerCriteria.customerId.eq();
		System.out.println(customerCriteria.uniqueCustomer());
		
		System.out.println("Retrieving Order by OrderCriteria");
		OrderCriteria orderCriteria = new OrderCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//orderCriteria.orderId.eq();
		System.out.println(orderCriteria.uniqueOrder());
		
		System.out.println("Retrieving OrderPositions by OrderPositionsCriteria");
		OrderPositionsCriteria orderPositionsCriteria = new OrderPositionsCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//orderPositionsCriteria.posId.eq();
		System.out.println(orderPositionsCriteria.uniqueOrderPositions());
		
		System.out.println("Retrieving Shipping by ShippingCriteria");
		ShippingCriteria shippingCriteria = new ShippingCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//shippingCriteria.trackingId.eq();
		System.out.println(shippingCriteria.uniqueShipping());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateDomänenmodellData retrieveAndUpdateDomänenmodellData = new RetrieveAndUpdateDomänenmodellData();
			try {
				retrieveAndUpdateDomänenmodellData.retrieveAndUpdateTestData();
				//retrieveAndUpdateDomänenmodellData.retrieveByCriteria();
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
