package org.mikadomethod.app;

import org.mikadomethod.app.ui.App;
import org.mikadomethod.app.ui.ApplicationException;

public class Launcher {

    public static void main(String[] argv) {
        try {
            App.setStorageFile(System.getProperty("user.dir") + "/db.txt");
            App app = new App();
            app.launch();
        } catch (ApplicationException e) {
            System.err.println("Could not start application");
            e.printStackTrace();
        }
    }

}
