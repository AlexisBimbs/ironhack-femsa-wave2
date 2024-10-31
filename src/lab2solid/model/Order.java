package lab2solid.model;

import java.math.BigDecimal;


public class Order {

	private int id;
	
	private String customerEmail;
	
	private BigDecimal amount;
	
	private int quantity;
	
	private String type;


	
	/**
	 * 
	 * @param id
	 * @param customerEmail
	 * @param amount
	 * @param quantity
	 */
	public Order(int id, String customerEmail, BigDecimal amount, int quantity,String type) {
		super();
		this.id = id;
		this.customerEmail = customerEmail;
		this.amount = amount;
		this.quantity = quantity;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
