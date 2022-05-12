package execution;

import org.bson.Document;
import org.bson.types.ObjectId;
import service.EmployeeService;
import service.EmployeeServiceImpl;


public class MongoExec {

    private static final EmployeeService employeeService = new EmployeeServiceImpl();

    public static void main(String[] args) {
        Document employee = new Document("name", "John").append("age", 23);

        ObjectId id = employeeService.save(employee);

        System.out.println(employeeService.findByDocument(employee));
    }
}
