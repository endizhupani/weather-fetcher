package com.endi.weatherservice.concrete;

import com.endi.weatherservice.interfaces.DbAccessData;
import com.endi.weatherservice.interfaces.IRepository;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 * MongoDB implementation of the IRepository interface
 */
public class MongoDbRepository implements IRepository {
    private final MongoClient mongoClient;
    private MongoDatabase database;

    /**
     * Creates a new instance of the {@link MongoDbRepository} class.
     *
     * @param mongoClientUri The connection string for the MongoDB server.
     */
    public MongoDbRepository(String mongoClientUri) {
        this.mongoClient = new MongoClient(new MongoClientURI(mongoClientUri));
    }

    /**
     * Creates a new instance of the {@link MongoDbRepository} class.
     *
     * @param mongoClientUri The connection string for the MongoDB server.
     * @param dbName         The name of the database to connect to.
     */
    public MongoDbRepository(String mongoClientUri, String dbName) {
        this(mongoClientUri);
        this.database = this.mongoClient.getDatabase(dbName);
    }

    public MongoDbRepository(DbAccessData accessData) {
        this(accessData.getConnectionString(), accessData.getDatabaseName());
    }
}
