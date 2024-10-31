package lab2solid.serviceimpl;

import lab2solid.interfaces.IPaymentProcessor;
import lab2solid.model.Order;

public class ExpressPaymentServiceImpl extends IPaymentProcessor{
	
	void process(Order order,String priority) {
        if (!super.process(order.getAmount(), priority)) {
            throw new Error("Express payment failed");
        }
    }

}
