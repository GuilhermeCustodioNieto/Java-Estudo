package com.version05.core;

import java.text.DateFormat;
import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    DateFormat fmt = DateFormat.getDateTimeInstance();
    Calendar calendar = Calendar.getInstance();

    System.out.println(fmt.format(calendar.getTime()));
  }
}
