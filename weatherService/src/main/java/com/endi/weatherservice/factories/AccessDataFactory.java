package com.endi.weatherservice.factories;

import com.endi.weatherservice.concrete.MongoDbAccessData;
import com.endi.weatherservice.entities.DatabaseType;
import com.endi.weatherservice.interfaces.DbAccessData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class that creates access data objects.
 */
public class AccessDataFactory {

    /**
     * Creates a new instance of the {@link DbAccessData} object.
     *
     * @param dbType Database type for with to create the access data object
     * @return A new instance of the {@link DbAccessData} object.
     */
    public static DbAccessData createInstance(DatabaseType dbType) {
        switch (dbType) {
            case MongoDb:
                Properties prop = getProperties();
                if (prop == null) {
                    return null;
                }
                return new MongoDbAccessData(prop.getProperty("mongodb_client_uri"), prop.getProperty("mongodb_db_name"));
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static Properties getProperties() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);
            return prop;

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
