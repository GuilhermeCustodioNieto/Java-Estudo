package teory;

import java.time.LocalDate;
import java.util.Date;


import teory.classes.Order;
import teory.classes.enums.OrderStatus;

public class TeoryEigth {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(order);

	}

}
