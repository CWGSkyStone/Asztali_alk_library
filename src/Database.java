/*
* File: Database.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection getConnection() throws SQLException;
}
