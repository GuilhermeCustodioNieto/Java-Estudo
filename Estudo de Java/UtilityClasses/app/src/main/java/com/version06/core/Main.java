package com.version06.core;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {
    Locale locale = new Locale("pt", "BR");
    Locale japones = new Locale("ja");

    DateFormat fmt = DateFormat.getDateInstance(DateFormat.FULL, locale);
    Calendar calendar = Calendar.getInstance();

    System.out.println(fmt.format(calendar.getTime()));
    
    System.out.println("------------");
    
    System.out.println("Brazil em inglês: " + locale.getDisplayCountry());
    System.out.println("Brazil em japones: " + locale.getDisplayCountry(japones));
    
    System.out.println("------------");
    
    System.out.println("Português em inglês: " + locale.getDisplayLanguage());
    System.out.println("Portugues em japones: " + locale.getDisplayLanguage(japones));
    
  }
}
