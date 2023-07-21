import java.util.Scanner;
import java.util.Locale;

public class SeventhEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] listNum = new int[num];
		
		for (int i=0; i<num; i++) {
			listNum[i] = scan.nextInt();
		}
		
		for (int i=0; i<num; i++) {
			if (listNum[i] < 0)
				System.out.println(listNum[i]);
		}
		scan.close();
	}

}
