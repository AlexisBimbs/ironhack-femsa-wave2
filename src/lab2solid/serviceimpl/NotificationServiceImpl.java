package lab2solid.serviceimpl;

import lab2solid.model.Order;

public class NotificationServiceImpl {
	
	public void notify(Order order) {
		System.out.println("Ejecutando notificacion al correo ".concat(order.getCustomerEmail()));
	}

}
