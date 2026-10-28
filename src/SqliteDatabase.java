/*
* File: SqliteDatabase.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteDatabase implements Database {
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:file:database/library.db?mode=rw");
    }
}
