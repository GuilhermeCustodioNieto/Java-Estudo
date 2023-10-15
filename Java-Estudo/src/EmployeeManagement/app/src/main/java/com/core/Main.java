package com.core;

import com.emplooyes.*;
import com.emplooyes.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Digite o numero de funcionarios a serem adicionados: ");
      int numFuncionarios = scan.nextInt();
      
      List<Employee> employees = new ArrayList<>();
      
      for(int i=0; i<numFuncionarios; i++){
        System.out.println("Employee #"+ (i+1) + "data: ");
        
        System.out.print("Outsourced? (y/n)");
        char outsourced = scan.next().charAt(0);
        
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Hours: ");
        int hours = scan.nextInt();
        System.out.print("Value per hour: ");
        double valuePerHour = scan.nextDouble();
        
        if(outsourced == 'y'){
          System.out.print("Additional Charge: ");
          Double additionalCharge = scan.nextDouble();
          
          employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        }
        
        else{
          employees.add(new Employee(name, hours, valuePerHour));
        }
        
        System.out.println("----------------");
      }
      
      System.out.println("PAYMENTS:");
        
        for(Employee employee : employees){
          System.out.println(employee.getName() + " - $ " + employee.payment());
        }
        
        System.out.println("end");
      
  }
}
