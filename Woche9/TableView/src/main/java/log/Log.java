package log;

import java.util.ArrayList;

public class Log {

    private ArrayList<LogEntry> entries = new ArrayList<>();

    public void addEntry(String entry){
        LogEntry logEntry = new LogEntry(entry);
    }

    public ArrayList<LogEntry> getEntries(){

        return entries;

    }
}
