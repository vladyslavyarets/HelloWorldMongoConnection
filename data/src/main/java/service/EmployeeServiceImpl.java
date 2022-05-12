package service;

import org.bson.Document;
import org.bson.types.ObjectId;
import repositories.EmployeeRepository;
import repositories.EmployeeRepositoryImpl;


public class EmployeeServiceImpl implements EmployeeService {

    private static final EmployeeRepository employeeRepository= new EmployeeRepositoryImpl();

    @Override
    public ObjectId save(Document document) {
        return employeeRepository.save(document);
    }

    @Override
    public Document findByDocument(Document document) {
        return employeeRepository.findByDocument(document);
    }
}
