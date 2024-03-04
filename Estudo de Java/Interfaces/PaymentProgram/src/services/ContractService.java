package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}

	public OnlinePaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	
	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = paymentService.interest(basicQuota, i);
            double fee = paymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.addInstallment(new Installment(dueDate, quota));
        }
			
		
	}
	
	@Override
	public String toString() {
		return "ContractService [paymentService=" + paymentService + "]";
	}
	
	
}
