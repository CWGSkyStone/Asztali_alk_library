/*
* File: BookService.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookService {
    private Database database;

    public BookService(Database database) {
        this.database = database;
    }

    public ArrayList<Book> getBooks() throws SQLException {
        ArrayList<Book> bookList = new ArrayList<>();
        String sql = "SELECT id, title, author, year, pages FROM books ORDER BY id";

        try (Connection connection = this.database.getConnection();
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql)) {
            while (result.next()) {
                Book book = new Book(
                    result.getInt("id"),
                    result.getString("title"),
                    result.getString("author"),
                    result.getInt("year"),
                    result.getInt("pages")
                );
                bookList.add(book);
            }
        }

        return bookList;
    }
}
