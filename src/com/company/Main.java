package com.company;
import java.io.*;
public class Main {

//Дан файл с программным кодом, содержащий комментарии - однострочные и многострочные.
//Необходимо программно удалить комментарии и переписать программный код в другой файл.
    /*df*/
    public static void main(String[] args) throws IOException {
        try {
            FileReader fl = new FileReader("code.txt");
            int cal = 0;
            String text = "";
            while ((cal = fl.read()) != -1) {
                text += (char) cal; //общее кол-во символов
            }

            String a = text.replaceAll("\\//.+", "");
            String c = a.replaceAll("\\/\\*([\\S\\s]+)\\*\\/", "");

            FileWriter fileWriter = new FileWriter("newCode.txt");
            fileWriter.write(c);
            fileWriter.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
