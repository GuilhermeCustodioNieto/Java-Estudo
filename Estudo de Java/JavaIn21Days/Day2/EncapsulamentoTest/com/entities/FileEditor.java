package com.entities;

import java.io.*;
import java.util.Scanner;

public class FileEditor {
    private String path;
    private String fileName;


    /*Constructor*/
    public FileEditor(String path) {
        this.path = path;

        File file = new File(path);
        if(file.exists() == false) {
            createFile();
        }

        this.fileName = file.getName();
    }

    /*Getters and Setters*/

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        /*Apagado o antigo nome do arquivo e novo nome de arquivo criado*/

        path = path.replace(this.fileName, "");

        File file = new File(path + fileName);
        file.renameTo(new File(fileName));
        this.fileName = fileName;
    }
    /*Main functions*/

    private void createFile() {
        try {
            File file = new File(path);
            file.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void newText(String text) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(text + "\n");
            writer.newLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void writeLines(String text) {
        if(text == null) {
            text = "";
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(text);
            writer.newLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String getText() {
        String textFile = "";

        try(Scanner scan = new Scanner(new File(path))) {
            while(scan.hasNextLine()) {
                textFile = textFile.concat(scan.nextLine() + "\n");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return textFile;
    }

    @Override
    public String toString() {
        return "FileEditor{" +
                "path='" + path + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
