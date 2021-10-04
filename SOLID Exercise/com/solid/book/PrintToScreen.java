package com.solid.book;

public class PrintToScreen {
	public static void print(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}