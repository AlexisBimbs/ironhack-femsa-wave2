package lab2solid.serviceimpl;

import lab2solid.interfaces.IInventoryService;
import lab2solid.model.Order;

public class InventoryServiceImpl extends IInventoryService{
	
	private int inventory;
	
	
	public InventoryServiceImpl(int inventory) {
		this.inventory = inventory;
	}
	public void verifyInventory(Order order) {
		super.verifyInventory(order, inventory);
		
	}

}
