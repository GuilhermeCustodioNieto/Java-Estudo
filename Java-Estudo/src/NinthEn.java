import java.util.Scanner;
public class NinthEn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[][] matriz = new int[num][num];
		
		for (int i=0;i<num; i++) {
			for (int x=0;x<num;x++) {
				matriz[i][x] = scan.nextInt();
			}
		}
		System.out.println("-------------------------------------");
		for (int i=0;i<num; i++) {
			for (int x=0;x<num;x++) {
				System.out.print(matriz[i][x] + " ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		for (int i=0; i<num; i++) {
			System.out.println(matriz[i][i]);
		}
		
		scan.close();
	}
		
}
