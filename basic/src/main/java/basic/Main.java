package basic;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;
import java.util.logging.SimpleFormatter;

public class Main {
    
    private static final Logger log = Logger.getLogger(Main.class.getName());
    
    public static void init() {  // logging config and usage 
        try {
            Handler handler = new FileHandler("mylog.txt");
            handler.setFormatter(new SimpleFormatter());
            
            log.addHandler(handler);
            log.setLevel(Level.ALL);
            
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello Basic Java Application !");
        
        log.info("Hello Java Logging System and Configuration");
    }
    
    
}







