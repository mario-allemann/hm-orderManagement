/**
 * Licensee: Mario Allemann(FHNW University of Applied Sciences Northwestern Switzerland)
 * License Type: Academic
 */
import org.orm.*;
public class ListDomänenmodellData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Product...");
		Product[] products = ProductDAO.listProductByQuery(null, null);
		int length = Math.min(products.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(products[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Payment...");
		Payment[] payments = PaymentDAO.listPaymentByQuery(null, null);
		length = Math.min(payments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(payments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Warehouse...");
		Warehouse[] warehouses = WarehouseDAO.listWarehouseByQuery(null, null);
		length = Math.min(warehouses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(warehouses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Customer...");
		Customer[] customers = CustomerDAO.listCustomerByQuery(null, null);
		length = Math.min(customers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(customers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Order...");
		Order[] orders = OrderDAO.listOrderByQuery(null, null);
		length = Math.min(orders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing OrderPositions...");
		OrderPositions[] orderPositionses = OrderPositionsDAO.listOrderPositionsByQuery(null, null);
		length = Math.min(orderPositionses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orderPositionses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Shipping...");
		Shipping[] shippings = ShippingDAO.listShippingByQuery(null, null);
		length = Math.min(shippings.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(shippings[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Product by Criteria...");
		ProductCriteria productCriteria = new ProductCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//productCriteria.prodId.eq();
		productCriteria.setMaxResults(ROW_COUNT);
		Product[] products = productCriteria.listProduct();
		int length =products== null ? 0 : Math.min(products.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(products[i]);
		}
		System.out.println(length + " Product record(s) retrieved."); 
		
		System.out.println("Listing Payment by Criteria...");
		PaymentCriteria paymentCriteria = new PaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//paymentCriteria.transactionID.eq();
		paymentCriteria.setMaxResults(ROW_COUNT);
		Payment[] payments = paymentCriteria.listPayment();
		length =payments== null ? 0 : Math.min(payments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(payments[i]);
		}
		System.out.println(length + " Payment record(s) retrieved."); 
		
		System.out.println("Listing Warehouse by Criteria...");
		WarehouseCriteria warehouseCriteria = new WarehouseCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//warehouseCriteria.placeID.eq();
		warehouseCriteria.setMaxResults(ROW_COUNT);
		Warehouse[] warehouses = warehouseCriteria.listWarehouse();
		length =warehouses== null ? 0 : Math.min(warehouses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(warehouses[i]);
		}
		System.out.println(length + " Warehouse record(s) retrieved."); 
		
		System.out.println("Listing Customer by Criteria...");
		CustomerCriteria customerCriteria = new CustomerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//customerCriteria.customerId.eq();
		customerCriteria.setMaxResults(ROW_COUNT);
		Customer[] customers = customerCriteria.listCustomer();
		length =customers== null ? 0 : Math.min(customers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(customers[i]);
		}
		System.out.println(length + " Customer record(s) retrieved."); 
		
		System.out.println("Listing Order by Criteria...");
		OrderCriteria orderCriteria = new OrderCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//orderCriteria.orderId.eq();
		orderCriteria.setMaxResults(ROW_COUNT);
		Order[] orders = orderCriteria.listOrder();
		length =orders== null ? 0 : Math.min(orders.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(orders[i]);
		}
		System.out.println(length + " Order record(s) retrieved."); 
		
		System.out.println("Listing OrderPositions by Criteria...");
		OrderPositionsCriteria orderPositionsCriteria = new OrderPositionsCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//orderPositionsCriteria.posId.eq();
		orderPositionsCriteria.setMaxResults(ROW_COUNT);
		OrderPositions[] orderPositionses = orderPositionsCriteria.listOrderPositions();
		length =orderPositionses== null ? 0 : Math.min(orderPositionses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(orderPositionses[i]);
		}
		System.out.println(length + " OrderPositions record(s) retrieved."); 
		
		System.out.println("Listing Shipping by Criteria...");
		ShippingCriteria shippingCriteria = new ShippingCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//shippingCriteria.trackingId.eq();
		shippingCriteria.setMaxResults(ROW_COUNT);
		Shipping[] shippings = shippingCriteria.listShipping();
		length =shippings== null ? 0 : Math.min(shippings.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(shippings[i]);
		}
		System.out.println(length + " Shipping record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListDomänenmodellData listDomänenmodellData = new ListDomänenmodellData();
			try {
				listDomänenmodellData.listTestData();
				//listDomänenmodellData.listByCriteria();
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
