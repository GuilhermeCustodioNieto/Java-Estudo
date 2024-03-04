package model.entities;

public class Invoice {
	private Double basicPayments;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPayments, Double tax) {
		super();
		this.basicPayments = basicPayments;
		this.tax = tax;
	}

	public Double getBasicPayments() {
		return basicPayments;
	}

	public void setBasicPayments(Double basicPayments) {
		this.basicPayments = basicPayments;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return getBasicPayments() + getTax();
	}
	
	@Override
	public String toString() {
		return "Envoice [basicPayments=" + basicPayments + ", tax=" + tax + "]";
	}
	
	
}
