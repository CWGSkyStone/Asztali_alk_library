/*
* File: BookView.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

import java.util.ArrayList;

public class BookView {
    public void showBooks(ArrayList<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("Nincs megjeleníthető könyv.");
            return;
        }

        System.out.printf("%-4s %-23s %-22s %s%n", "Id", "Cím", "Szerző", "Év");
        for (Book book : bookList) {
            System.out.printf("%-4d %-23s %-22s %d%n",
                book.getId(), book.getTitle(), book.getAuthor(), book.getYear());
        }
    }

    public void showError(String message) {
        System.err.println(message);
    }
}
