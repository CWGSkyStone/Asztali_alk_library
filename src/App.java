/*
* File: App.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

public class App {
    public static void main(String[] args) {
        BookController controller = new BookController();
        if (!controller.start()) {
            System.exit(1);
        }
    }
}
