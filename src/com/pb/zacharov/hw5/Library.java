package com.pb.zacharov.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Приключения","Иванов И. И","2000");
        books[1] = new Book("Словарь","Сидоров А. В","1980");
        books[2] = new Book("Энциклопедия","Гусев К. В","2010");

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Zacharov.D.E",1,"TK","1994","063");
        readers[1] = new Reader("Alekseev.D.B",2,"TK","1995","099522");
        readers[2] = new Reader("Bogdanov.Z.D",3,"TK","1991","098");

        System.out.println("Книги: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Читатели: ");
        for (Reader reader : readers) {
            System.out.println(reader.toString());
        }

        readers[0].takeBook(5);
        readers[0].takeBook("Приключения","Словарь","Энциклопедия");
        readers[0].takeBook(books[0],books[1],books[0]);


        readers[1].returnBook(3);
        readers[1].returnBook( "Третья Книга", "Вторая Книга", "Первая Книга");
        readers[1].returnBook(books[0], books[1], books[2]);
    }
}
