package lab2solid.interfaces;

import lab2solid.model.Order;

public abstract class IInventoryService {
	
 public void  verifyInventory(Order order,int quantity) {
	  if(quantity< order.getQuantity()) {
		  throw new Error("No hay cantidad suficiente para despachar la roden");
	  }
	  
  }


}
