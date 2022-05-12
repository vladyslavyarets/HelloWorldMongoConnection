package repositories;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;


public class EmployeeRepositoryImpl extends BasicRepository implements EmployeeRepository{

    public EmployeeRepositoryImpl() {
    }

    MongoDatabase database = client.getDatabase("Employees");
    MongoCollection<Document> employeeMongoCollection = database.getCollection("employee");

    @Override
    public ObjectId save(Document document) {
        return employeeMongoCollection.insertOne(document).getInsertedId().asObjectId().getValue();
    }

    @Override
    public Document findByDocument(Document document) {
        return employeeMongoCollection.find(document).first();
    }
}
