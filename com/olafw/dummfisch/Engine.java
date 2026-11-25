package com.olafw.dummfisch;

public class Engine {
    public void initialize(String[] args) {
        
        Arguments argsParser = new Arguments();
        argsParser.parseArguments(args);

        // Logger.logInfo("Dummfisch startet.");

    }   
}