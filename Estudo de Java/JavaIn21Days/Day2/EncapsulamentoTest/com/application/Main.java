package com.application;

import com.entities.FileEditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileEditor md = new FileEditor(scan.nextLine());

        /*Escrever uma receita com base na entrada do usuário*/


        md.newText(scan.nextLine());
        System.out.println(md.getText());

        /*Escrever diversas linhas da receita até cansar*/
        String input = "";
        do{
            input = scan.nextLine();
            md.writeLines(input);
        } while (input != "");

        System.out.println(md.getText()
        );
    }
}
