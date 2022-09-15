package log;

import java.time.LocalDateTime;

public class LogEntry {
    private String entry;
    private LocalDateTime timestamp = LocalDateTime.now();

    public LogEntry(String entry) {
        this.entry = entry;
        this.timestamp = LocalDateTime.now();
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
