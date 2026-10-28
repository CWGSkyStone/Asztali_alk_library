/*
* File: BookController.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController {
    private BookService bookService;
    private BookView bookView;

    public BookController() {
        Database database = new SqliteDatabase();
        this.bookService = new BookService(database);
        this.bookView = new BookView();
    }

    public boolean start() {
        try {
            ArrayList<Book> bookList = this.bookService.getBooks();
            this.bookView.showBooks(bookList);
            return true;
        } catch (SQLException e) {
            this.bookView.showError("Az adatbázis lekérdezése sikertelen: " + e.getMessage());
            return false;
        }
    }
}
