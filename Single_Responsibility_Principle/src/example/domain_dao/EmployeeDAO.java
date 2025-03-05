package example.domain_dao;

import example.domain.Employee;

// DATA ACCESS OBJECT
public class EmployeeDAO {

    public void saveEmployee(Employee employee){

//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("INSERT INTO Employee tbl");
//        connectionManager.disconnect();

        System.out.println("saved employee to the database: " + employee);

    }

    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee from the database: " + employee);
    }

}
