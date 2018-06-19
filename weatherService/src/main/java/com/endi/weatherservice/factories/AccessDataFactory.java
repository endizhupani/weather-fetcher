package com.endi.weatherservice.factories;

import com.endi.weatherservice.concrete.MongoDbAccessData;
import com.endi.weatherservice.entities.DatabaseType;
import com.endi.weatherservice.interfaces.DbAccessData;

import java.util.ResourceBundle;

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
                ResourceBundle prop = getProperties();
                if (prop == null) {
                    return null;
                }
                return new MongoDbAccessData(prop.getString("mongodb_client_uri"), prop.getString("mongodb_db_name"));
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static ResourceBundle getProperties() {
        return ResourceBundle.getBundle("config");
    }
}
