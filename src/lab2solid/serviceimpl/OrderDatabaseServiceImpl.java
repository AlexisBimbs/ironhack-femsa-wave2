package lab2solid.serviceimpl;

import lab2solid.model.Order;

public class OrderDatabaseServiceImpl {
	
	public void update(Order order, String status) {
		
		System.out.println("Se guarda en base con status ".concat(status));
	}

}
