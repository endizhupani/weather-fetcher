package com.endi.weatherservice.factories;

import com.endi.weatherservice.concrete.MongoDbRepository;
import com.endi.weatherservice.interfaces.DbAccessData;
import com.endi.weatherservice.interfaces.IRepository;

/**
 * Builds objects of type {@link com.endi.weatherservice.interfaces.IRepository}
 */
public class RepositoryFactory {

    /**
     * Creates an instance of the {@link IRepository} interface
     *
     * @return An object of type {@link IRepository}
     */
    public static IRepository createRepositoryInstance(DbAccessData accessData) {
        switch (accessData.getDatabaseType()) {
            case MongoDb:
                return new MongoDbRepository(accessData);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
