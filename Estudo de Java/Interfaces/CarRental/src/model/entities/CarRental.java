package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime start;
	private LocalDateTime fininsh;
	private Vehicle vehicle;
	private Envoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(LocalDateTime start, LocalDateTime fininsh, Vehicle vehicle) {
		super();
		this.start = start;
		this.fininsh = fininsh;
		this.vehicle = vehicle;
		this.invoice = invoice;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFininsh() {
		return fininsh;
	}

	public void setFininsh(LocalDateTime fininsh) {
		this.fininsh = fininsh;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Envoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Envoice invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		return "CarRental [start=" + start + ", fininsh=" + fininsh + ", vehicle=" + vehicle + ", invoice=" + invoice
				+ "]";
	}

	
	
}
