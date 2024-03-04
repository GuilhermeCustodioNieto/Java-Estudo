package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
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
		String allInstallments = "";
		
		for(int i=0; i< installments.size(); i++) {
			allInstallments += installments.get(i);
			allInstallments += "\n";
		}
		
		return allInstallments;
		
	}
	
	
	
}
