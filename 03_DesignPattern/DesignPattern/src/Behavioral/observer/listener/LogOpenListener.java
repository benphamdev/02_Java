package Behavioral.observer.listener;

import java.io.File;

public class LogOpenListener implements EventListener{
    private final File log;

    public LogOpenListener(String log) {
        this.log = new File(log);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following message: " + file + "\n");
    }
}
