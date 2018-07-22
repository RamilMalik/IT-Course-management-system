
package com.ramil.course.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    
    private static Properties properties;
    
    static {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("app.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static String getUsername(){
        return properties.getProperty("username");
    }
    
    public static String getPassword(){
        return properties.getProperty("password");
    }
    
}
