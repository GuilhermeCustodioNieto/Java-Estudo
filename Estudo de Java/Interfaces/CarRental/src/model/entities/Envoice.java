package model.entities;

public class Envoice {
	private Double basicPayments;
	private Double tax;
	
	public Envoice() {
		
	}

	public Envoice(Double basicPayments, Double tax) {
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

	@Override
	public String toString() {
		return "Envoice [basicPayments=" + basicPayments + ", tax=" + tax + "]";
	}
	
	public Double totalPayment() {
		return getBasicPayments() - getTax();
	}
}
