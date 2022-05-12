package repositories;

import org.bson.Document;
import org.bson.types.ObjectId;


public interface EmployeeRepository {

    ObjectId save(Document document);

    Document findByDocument(Document document);
}
