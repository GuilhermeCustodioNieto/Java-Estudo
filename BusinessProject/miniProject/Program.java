package miniProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import miniProjectEntites.Department;
import miniProjectEntites.HourContract;
import miniProjectEntites.Worker;
import miniProjectEntitesEnums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter department's name: ");
		String departmentName = scan.nextLine();
		
		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = scan.nextDouble();
		
		
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for (int i=0; i<n;i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Value per Hour: ");
			double valuerPerHour = scan.nextDouble();
			System.out.print("Duration (Hours): ");
			int hour = scan.nextInt();
			HourContract contract = new HourContract(contractDate, valuerPerHour, hour);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income(MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for "+ monthAndYear + ": " +String.format("%.2f", worker.income(year, month)));
		
		
		scan.close();

	}

}
