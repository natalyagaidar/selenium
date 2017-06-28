package com.kit.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.PropertyResourceBundle;

/**
 * Created by Nata on 6/23/2017.
 */
public class PropertiesCache {
    private final Properties configProp = new Properties();
    private static final PropertiesCache INSTANSE = new PropertiesCache();

    private PropertiesCache(){
        //Private c-tor to restrict new instances
        System.out.println("Read all properties from the file");
        InputStream in = this.getClass().getClassLoader().getResourceAsStream( "test.properties");
        try{
            configProp.load(in);

        }
        catch (IOException ex){
            System.out.println("Can't read properties from file. " + ex);
        }
    }

    public static String getProrerty(String key){
        return INSTANSE.configProp.getProperty(key);

    }
}
