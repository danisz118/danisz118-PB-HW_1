package com.pb.zacharov.hw9;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static boolean dividesByTwo(int a) {
        return (a % 2 == 0);
    }

    public  void createNumbersFile(String PathFile, int[][] ArrayInt) {
        Path PathFileTxt = Paths.get(PathFile);
        try (BufferedWriter WritterToTxt = Files.newBufferedWriter(PathFileTxt)) {
            for (int i = 0; i < ArrayInt.length; i++) {
                for (int j = 0; j < ArrayInt[i].length; j++) {
                    WritterToTxt.write(ArrayInt[i][j] + "\t");
                }

                WritterToTxt.write("\n");
            }

        } catch (IOException ErrorTxt) {
            System.out.println("Ошибка записи файла: " + ErrorTxt);
        }
        System.out.println("Файл в папке  " + PathFileTxt.toAbsolutePath() + " успешно создан ");
    }


    public  void createOddNumbersFile(String PathFile, String OverSave) {
        String[] subStrLineTxt;
        String delimeterLineTxt = "\t";
        int[][] ArrayIntNew = new int[10][10];
        int rowArray = 0;

        Path PathFileTxt = Paths.get(PathFile);
        try (BufferedReader ReaderTxt = Files.newBufferedReader(PathFileTxt)) {
            String ReaderMas;
            while ((ReaderMas = ReaderTxt.readLine()) != null) {
                //System.out.println(ReaderMas);
                subStrLineTxt = ReaderMas.split(delimeterLineTxt);
                for (int i = 0; i < subStrLineTxt.length; i++) {
                    int tempInt = Integer.parseInt(subStrLineTxt[i]);
                    if (dividesByTwo(tempInt)) {
                        ArrayIntNew[rowArray][i] = 0;
                    } else {
                        ArrayIntNew[rowArray][i] = tempInt;
                    }
                    System.out.print(ArrayIntNew[rowArray][i] + "\t");

                }
                System.out.println("");
                rowArray++;
            }
        } catch (Exception ErrorTxt) {
            System.out.println("Ошибка считывания файла   " + ErrorTxt);
        }

        if (OverSave.equals("Y")) {
            System.out.println("Записали в новый файл - odd-numbers.txt");
            createNumbersFile("c:\\\\odd-numbers.txt", ArrayIntNew);
        }
    }


}
