/**
 * Licensee: Mario Allemann(FHNW University of Applied Sciences Northwestern Switzerland)
 * License Type: Academic
 */
import org.orm.*;
public class CreateDomänenmodellData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = DomänenmodellPersistentManager.instance().getSession().beginTransaction();
		try {
			Product product = ProductDAO.createProduct();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orderPositions, productName, price
			ProductDAO.save(product);
			Payment payment = PaymentDAO.createPayment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payDate, orderId, amount
			PaymentDAO.save(payment);
			Warehouse warehouse = WarehouseDAO.createWarehouse();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : prodId, amount
			WarehouseDAO.save(warehouse);
			Customer customer = CustomerDAO.createCustomer();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : order, loyalityPts_int, city, zip, address, firstname, lastname
			CustomerDAO.save(customer);
			Order order = OrderDAO.createOrder();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orderPositions, customer
			OrderDAO.save(order);
			OrderPositions orderPositions = OrderPositionsDAO.createOrderPositions();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : qty, product, order
			OrderPositionsDAO.save(orderPositions);
			Shipping shipping = ShippingDAO.createShipping();
			// Initialize the properties of the persistent object here
			ShippingDAO.save(shipping);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateDomänenmodellData createDomänenmodellData = new CreateDomänenmodellData();
			try {
				createDomänenmodellData.createTestData();
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
