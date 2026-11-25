package com.olafw.dummfisch;

public class Arguments {
    
    // Whether to log info messages.
    private boolean logInfo = false;
    private int depth = 3; 

    // Constructor
    Arguments() {
        this.logInfo = logInfo;
        this.depth = depth;
    }

    // Getter for logInfo
    public boolean getVerbose() {
        return logInfo;
    }

    // Getter for Depth Level
    public int getDepth() {
        return depth;
    }

    public void parseArguments(String[] args) {
        
        for (String currentArgument : args) {
            if (currentArgument.contains("--verbose")) {
                logInfo = true;
            }
            
            if (currentArgument.contains("--depth=")) {
                String[] splitDepthArgument = currentArgument.split("=");
                depth = Integer.parseInt(splitDepthArgument[1]);
            }
        }
        
        Logger logger = new Logger();
        System.out.println("Depth: " + depth);

    }
}
