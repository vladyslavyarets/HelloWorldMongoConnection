package service;

import org.bson.Document;
import org.bson.types.ObjectId;


public interface EmployeeService {

    ObjectId save(Document document);

    Document findByDocument(Document document);
}
