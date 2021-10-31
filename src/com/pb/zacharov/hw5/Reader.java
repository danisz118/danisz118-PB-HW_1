package com.pb.zacharov.hw5;

import java.util.Arrays;

public class Reader {

    String FIO;
    int numberReaderTicket;
    String faculty;
    String dateBorn;
    String phoneNumber;

    public Reader(String FIO, int numberReaderTicket, String faculty, String dateBorn, String phoneNumber) {
        this.FIO = FIO;
        this.numberReaderTicket = numberReaderTicket;
        this.faculty = faculty;
        this.dateBorn = dateBorn;
        this.phoneNumber = phoneNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getNumberReaderTicket() {
        return numberReaderTicket;
    }

    public void setNumberReaderTicket(int numberReaderTicket) {
        this.numberReaderTicket = numberReaderTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "FIO='" + FIO + '\'' +
                ", numberReaderTicket=" + numberReaderTicket +
                ", faculty='" + faculty + '\'' +
                ", dateBorn='" + dateBorn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(FIO + " взял " + numberOfBooks + "книг");

    }


    public void takeBook(String... bookNames) {
        System.out.println(String.format("%s взял книги: ", FIO));
        for (String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.print("\b\b\n");
    }


    public void takeBook(Book...books) {
        System.out.print(String.format("%s взял книги: ", FIO));
        for (Book book : books) {
            System.out.println(book.toString()+", ");
        }
        System.out.print("\b\b\n");
    }


    public void returnBook(int numberOfBooks) {
        System.out.println(FIO + " вернул " + numberOfBooks + " книги");

    }

    public void returnBook(String... bookNames) {
        System.out.println(String.format("%s вернул книги: ", FIO));
        for (String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.print("\b\b\n");
    }
    public void returnBook(Book...books) {
        System.out.print(String.format("%s вернул книги: ", FIO));
        for (Book book : books) {
            System.out.println(book.toString()+", ");
        }
        System.out.print("\b\b\n");
    }

}


