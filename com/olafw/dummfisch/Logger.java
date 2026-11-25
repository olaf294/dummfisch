package com.olafw.dummfisch;

public class Logger {

    private static final String COLOR_RESET = "\u001B[0m"; // Reset
    private static final String COLOR_RED = "\u001B[31m"; // Red, Error
    private static final String COLOR_GREEN = "\u001B[32m"; // Green, "success" (success is output)
    private static final String COLOR_YELLOW = "\u001B[33m"; // Yellow, Warn
    private static final String COLOR_BLUE = "\u001B[34m"; // Blue, Info

    private Arguments argsParser = new Arguments();

    /**
     * Logs an INFO message in COLOR_BLUE. 
     * @param message - Message to log
     */
    public void logInfo(String message) {
        if (argsParser.getVerbose()) { 
            System.out.println(COLOR_BLUE + "\n[info] " + message + COLOR_RESET);
        }
    }

    /**
     * Logs a normal output message in COLOR_GREEN. 
     * @param message - Message to log
     */
    public void logSuccess(String message) {
        System.out.println(COLOR_GREEN + "\n[out] " + message + COLOR_RESET);
    }

    /**
     * Logs an ERROR message in COLOR_RED. 
     * @param message - Message to log
     */
    public void logWarn(String message) {
        System.out.println(COLOR_YELLOW + "[WARN] " + message + COLOR_RESET);
    }

    /**
     * Logs an ERROR message in COLOR_RED. 
     * @param message - Message to log
     */
    public void logError(String message) {
        System.out.println(COLOR_RED + "[ERROR] " + message + COLOR_RESET);
    }

    /**
     * Logs an empty line.
     */
    public void logEmptyLine() {
        System.out.println();
    }
}