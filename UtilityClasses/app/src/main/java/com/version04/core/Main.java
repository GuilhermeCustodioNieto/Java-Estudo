package com.version04.core;

import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.getFirstDayOfWeek());
    System.out.println(calendar.DAY_OF_MONTH);
    calendar.add(calendar.DAY_OF_MONTH, 2);
    System.out.println(calendar.DAY_OF_MONTH);
  }
}
