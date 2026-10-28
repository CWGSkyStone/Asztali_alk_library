/*
* File: library.sql
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT (saját kód); a feladat adatainak forrása alább
*
* Adatok: Sallai András, szit.hu, Feladat 0003, CC BY-SA 4.0
* https://szit.hu/doku.php?id=oktatas:programozas:feladatok:adatbazis-kezeles#feladat_0003
*/

BEGIN TRANSACTION;

CREATE TABLE books (
    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    year INTEGER,
    pages INTEGER
);

INSERT INTO books (id, title, author, year, pages) VALUES
(1, 'Egri csillagok', 'Gárdonyi Géza', 1901, 580),
(2, 'A Pál utcai fiúk', 'Molnár Ferenc', 1906, 288),
(3, 'Légy jó mindhalálig', 'Móricz Zsigmond', 1920, 410),
(4, 'Tüskevár', 'Fekete István', 1957, 320),
(5, 'Abigél', 'Szabó Magda', 1970, 450);

COMMIT;
