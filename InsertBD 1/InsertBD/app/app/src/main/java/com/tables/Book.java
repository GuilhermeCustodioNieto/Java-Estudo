package com.tables;

import com.tables.Publico;
import java.lang.StringBuilder;

public class Book {
  private String ranking;
  private Integer emprestimos;
  private String obras;
  private String autores;
  private Publico publico;

  public Book(String ranking, int emprestimos, String obras, String autores, Publico publico) {
    this.ranking = ranking;
    this.emprestimos = emprestimos;
    this.obras = obras;
    this.autores = autores;
    this.publico = publico;
  }

  public String toString() {
    StringBuilder bookResult = new StringBuilder();

    bookResult.append("(");

    bookResult.append('"');
    bookResult.append(ranking);
    bookResult.append('"');
    bookResult.append(", ");

    bookResult.append(emprestimos);
    bookResult.append(", ");

    bookResult.append('"');
    bookResult.append(obras);
    bookResult.append('"');
    bookResult.append(", ");

    bookResult.append('"');
    bookResult.append(autores);
    bookResult.append('"');
    bookResult.append(", ");

    String publicoTransform = publico.name();

    bookResult.append('"');
    bookResult.append(publicoTransform.toLowerCase());
    bookResult.append('"');
    bookResult.append("");

    bookResult.append(")\n");

    return bookResult.toString();
  }
}
