package lab2solid.interfaces;

import java.math.BigDecimal;

public abstract class IPaymentProcessor {
	
	public boolean process(BigDecimal amount) {
		System.out.print("Realizando pago");
		return true;
	}
	
	public boolean process(BigDecimal amount,String priority) {
		System.out.print("Realizando pago ".concat(priority));
		return true;
	}

}
