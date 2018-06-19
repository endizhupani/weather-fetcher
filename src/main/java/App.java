import com.endi.weatherservice.entities.DatabaseType;
import com.endi.weatherservice.factories.AccessDataFactory;
import com.endi.weatherservice.factories.RepositoryFactory;
import com.endi.weatherservice.interfaces.DbAccessData;
import com.endi.weatherservice.interfaces.IRepository;

/**
 * Class with the main method.
 */
public class App {
    public static void main(String args[]) {
        DbAccessData accessData = AccessDataFactory.createInstance(DatabaseType.MongoDb);
        IRepository repo = RepositoryFactory.createRepositoryInstance(accessData);
    }
}
