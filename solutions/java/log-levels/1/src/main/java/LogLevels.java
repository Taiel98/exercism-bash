public class LogLevels {
    
    public static String message(String logLine) {
        String[] splitedLog = logLine.split(" ", 2);
        String level = splitedLog[0];
        String message = splitedLog[1];
        return message.trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String level = logLine.substring(start + 1, end);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        String response = message + " (" + level + ")";
        return response;
    }
}
