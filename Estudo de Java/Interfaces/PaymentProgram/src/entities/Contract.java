package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, Date date, Double totalValue, List<Installment> installments) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallment(int installmentNumber) {
		installments.remove(installmentNumber);
	}

	@Override
	public String toString() {
		return "Contract [number=" + number + ", date=" + date + ", totalValue=" + totalValue + ", installments="
				+ installments + "]";
	}
	
	
	
}
