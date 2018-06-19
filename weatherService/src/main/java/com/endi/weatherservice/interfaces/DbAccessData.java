package com.endi.weatherservice.interfaces;

import com.endi.weatherservice.entities.DatabaseType;

/**
 * Interface for objects containing the access data for the database
 */
public interface DbAccessData {

    /**
     * Gets the connection string for the database.
     *
     * @return The connection string for the database.
     */
    String getConnectionString();

    /**
     * Gets the name of the database.
     *
     * @return The name of the database
     */
    String getDatabaseName();

    /**
     * Gets the username to be used to connect with the database.
     *
     * @return The username to be used to connect with the database.
     */
    String getUserName();

    /**
     * Gets the password to be used to authenticate to the database.
     *
     * @return The password to be used to authenticate to the database.
     */
    String getUserPassword();

    /**
     * Gets the type of the database server.
     *
     * @return The type of the database server.
     */
    DatabaseType getDatabaseType();
}
