package lab2solid.serviceimpl;

import lab2solid.interfaces.IPaymentProcessor;
import lab2solid.model.Order;

public class StandardPaymentServiceImpl extends IPaymentProcessor {


	public boolean process(Order order) {
		  if (super.process(order)) {
	            return true;
	        } else {
	            throw new Error("Payment failed");
	        }
		
	}

}
