package lab2solid.serviceimpl;

import lab2solid.interfaces.IPaymentProcessor;
import lab2solid.model.Order;

public class OrderProcessor {

	OrderDatabaseServiceImpl orderDatabaseServiceImpl;
	NotificationServiceImpl notificationServiceImpl;
	
	InventoryServiceImpl inventoryServiceImpl;
	
	IPaymentProcessor iPaymentProcessor;

	public OrderProcessor(InventoryServiceImpl inventoryServiceImpl, IPaymentProcessor iPaymentProcessor) {
		this.inventoryServiceImpl = inventoryServiceImpl;
		this.iPaymentProcessor = iPaymentProcessor;
		this.orderDatabaseServiceImpl = new OrderDatabaseServiceImpl();
		this.notificationServiceImpl = new NotificationServiceImpl();
	}
	
	//se crean procesos separados para no violar los principios SOLID
	/**
	 * 
	 * CADA CLASE TIENE SU COMPORTAMIENTO PROPIO SI BIEN CONVERGEN EN EL PAGO , CADA TIPO DE PAGO TIENE 
	 * SU IMPLEMENTACION SEPARADA
	 */
	
	public void procesOrder(Order order) {
		   inventoryServiceImpl.verifyInventory(order);

	        if (order.getType() == "standard") {
	        	iPaymentProcessor.process(order.getAmount());
	        } else if (order.getType()== "express") {
	            iPaymentProcessor.process(order.getAmount(), "highPriority");
	        }

	        orderDatabaseServiceImpl.update(order, "processed");
	        notificationServiceImpl.notify(order);
		
	}
	
}
