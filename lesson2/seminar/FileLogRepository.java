package geekbrains_course.jdk.lesson2.seminar;

import java.io.*;

public class FileLogRepository implements LogRepository {
    private final String logFilePath;

    public FileLogRepository(String logFilePath) {
        this.logFilePath = logFilePath;
    }
    
    @Override
    public void saveLog(String text) {
        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readLog() {
        StringBuilder logContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logContent.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logContent.toString();
    }
}