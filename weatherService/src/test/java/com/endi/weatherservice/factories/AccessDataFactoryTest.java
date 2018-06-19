package com.endi.weatherservice.factories;

import com.endi.weatherservice.concrete.MongoDbAccessData;
import com.endi.weatherservice.entities.DatabaseType;
import com.endi.weatherservice.interfaces.DbAccessData;
import org.junit.Assert;

/**
 * Unit tests for the {@link AccessDataFactory}
 */
public class AccessDataFactoryTest {
    @org.junit.Test
    public void createInstance() throws Exception {
        // Arrange

        // Act

        DbAccessData instance = AccessDataFactory.createInstance(DatabaseType.MongoDb);

        // Assert
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof MongoDbAccessData);
        Assert.assertNotNull(instance.getConnectionString());
        Assert.assertNotNull(instance.getDatabaseName());
    }

}