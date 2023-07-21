import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class FirstEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Retangulo retancle = new Retangulo();
		
		System.out.print("enter retancle width and height: ");
		retancle.widht = scan.nextDouble();
		retancle.height = scan.nextDouble();
		
		System.out.println("AREA = " + retancle.area());
		System.out.println("PERIMETER = " + retancle.perimeter());
		System.out.println("DIAGONAL = " + retancle.diagonal());
		scan.close();
	}

}
