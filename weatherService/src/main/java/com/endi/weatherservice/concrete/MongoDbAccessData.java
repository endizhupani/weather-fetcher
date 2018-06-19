package com.endi.weatherservice.concrete;

import com.endi.weatherservice.entities.DatabaseType;
import com.endi.weatherservice.interfaces.DbAccessData;

/**
 * Object representing the access data for a MongoDB instance
 */
public class MongoDbAccessData implements DbAccessData {

    private static final DatabaseType databaseType = DatabaseType.MongoDb;
    private String connectionString;
    private String databaseName;
    private String userName;
    private String userPassword;

    /**
     * Creates a {@link MongoDbAccessData} object.
     *
     * @param connectionString A connection string in the format "mongodb://[host]:[port]"
     * @param databaseName     Name of the database to connect to.
     * @param userName         Name of the user that will authenticate to the server.
     * @param userPassword     User password.
     */
    public MongoDbAccessData(String connectionString, String databaseName, String userName, String userPassword) {
        this(connectionString, databaseName);
        this.userName = userName;
        this.userPassword = userPassword;
    }

    /**
     * Creates a {@link MongoDbAccessData} object.
     *
     * @param connectionString A connection string in the format "mongodb://[host]:[port]"
     * @param databaseName     Name of the database to connect to.
     */
    public MongoDbAccessData(String connectionString, String databaseName) {
        this.connectionString = connectionString;
        this.databaseName = databaseName;
    }

    /**
     * Gets the connection string for the database.
     *
     * @return The connection string for the database.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * Gets the name of the database.
     *
     * @return The name of the database
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Gets the username to be used to connect with the database.
     *
     * @return The username to be used to connect with the database.
     */
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the password to be used to authenticate to the database.
     *
     * @return The password to be used to authenticate to the database.
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Gets the type of the database server.
     *
     * @return The type of the database server.
     */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }
}
