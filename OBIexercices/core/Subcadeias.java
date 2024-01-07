package com.core;

import java.util.Scanner;

public class Subcadeias {

  public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        int tamanhoString = scan.nextInt();
        String inputString = scan.next();
        
        int maior = inputString.substring(0, 0).length();
    
    
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j <= inputString.length(); j++) {
                String substring = inputString.substring(i, j);
                boolean ePalindromo = palindromo(substring);
                
                if(ePalindromo && substring.length() >= maior){
                  maior = substring.length();
                }
            }
        }
        System.out.println(maior);
        scan.close();
  }
  public static boolean palindromo(String cadeia){
    int j = cadeia.length() - 1;
    for(int i=0; i<= cadeia.length()-1; i++){
      if(cadeia.charAt(i) != cadeia.charAt(j)){
        return false;
      }
    j--;
    }
    return true;
  }
}
/*
lógica:

Primeiro, vamos ler os valores, posteriormente entramos em 2 laços for

Onde lá, vamos pegar todas as substrings da string original
A lógica das substrings é a seguinte: você pega de n até j, então se temos a string Hello, e n seria equivalente ao "e" e J seria equivalente ao "l", então pegariamos tudo entre "e" e "l",.posteriormente o J vai valer "o", então vamos pegar tudo entre "e" e "o"
Assim, pegamos todas as substrings.

Posteriormente utilizamos o método palíndromo() que vai retornar um boolean. Caso o método palíndromo retorne que a sua substring é um palíndromo e a sua substring é a maior substring que é um palíndromo, vamos armazenar o tamanho dela na variável maior (ou seja, verificamos se a substring é um palíndromo e se ela é a maior substring existente que é um palíndromo)

MÉTODO PALÍNDROMO()

O método palíndromo vai receber um parâmetro que é uma string, e vai percorrer essa string de frente pra trás (no laço for, usando a variável i)

E a variável j vai percorrer de trás pra frente.

Caso i for diferente de J, a string já não é um palíndromo, então o método vai retornar false e vai acabar ali.
Se o for acabar de rodar (ou seja, nunca retornar false), então retorna true
*/