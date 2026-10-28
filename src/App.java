/*
* File: App.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-28
* Github: https://github.com/CWGSkyStone/
* Licenc: MIT
*/

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        BookController controller = new BookController();
        if (!controller.start()) {
            System.exit(1);
        }
    }
}
