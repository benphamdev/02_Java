package observer;

import observer.editor.Editor;
import observer.listeners.EmailNotificationListener;
import observer.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile(
                    "/media/benpham/New Volume/03_WorkSpace/02_Java/03_DesignPattern/DesignPattern/src/observer/test.txt"
            );
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
