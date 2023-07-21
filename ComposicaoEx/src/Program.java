import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entites.enums.OrderStatus;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		 String name = scan.nextLine();
		 System.out.print("Email: ");
		 String email = scan.next();
		 System.out.print("Birth date (DD/MM/YYYY): ");
		 String date = scan.next();
		 LocalDate birthDate = LocalDate.parse(date, fmt);
		 
		 System.out.println("Enter order data: ");
		 System.out.print("Status: ");
		 String orderStatus = scan.next();
		 System.out.print("How many items to this order? ");
		 int quantityItem = scan.nextInt();
		 
		 Client client = new Client(name, email, birthDate);
		 Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(orderStatus), client);
		 
		 String productName;
		 double productPrice;
		 int quantityProduct;
		 
		 OrderItem item;
		 Product product;
		 
		 for (int i=0;i<quantityItem;i++) {
			 System.out.println("Enter #"+i+" item data:");
			 System.out.print("Product name: ");
			 productName = scan.next();
			 System.out.print("Product price: ");
			 productPrice = scan.nextDouble();
			 System.out.print("Quantity: ");
			 quantityProduct = scan.nextInt();
			 
			 product = new Product(productName, productPrice);
			 item = new OrderItem(quantityProduct, productPrice, product);
			 
			 order.addItem(item);
			 
			 
		 }
		 
		 System.out.println("ORDER SUMARY: ");
		 System.out.println("Order Moment: "+order.getMoment());
		 System.out.println("Order status: "+order.getStatus());
		 System.out.println("Client: "+order.getClient().getName()+" " + order.getClient().getBirthDate() + " - "+order.getClient().getEmail());
		 
		 System.out.println("Order items: ");
		 for (OrderItem i : order.getOrderItem()) {
			 System.out.println(i.getProduct().getName()+", " + i.getPrice() + ", Quantity: " + i.getQuantity() + ", Subtotal: $"+i.subTotal());
		 }
		 System.out.println("Total price: $" + order.total());
		 scan.close();
	}

}
