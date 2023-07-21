import java.util.Scanner;
import java.time.LocalDate;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class TenthEx {

	public static void main(String[] args) {
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 LocalDate now = LocalDate.now();
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("dgite sua data de nascimento(OBS: DIGITE NO FORMATO DD/MM/YYYY): ");
		 String dataNasc = scan.next();
		 
		 LocalDate nascimento = LocalDate.parse(dataNasc, fmt);
		 
		 Duration milisegs = Duration.between(nascimento.atStartOfDay(), now.atStartOfDay());
		 System.out.println("miisegs: " + milisegs.toMillis());
		 
		  scan.close();
	}

}
