package example.clients;

import example.domain.Employee;
import example.domain_dao.EmployeeDAO;
import example.reporting.EmployeeReportFormatter;
import example.reporting.FormatType;

public class ClientModule {

    public static void hireNewEmployee(Employee employee){

        EmployeeDAO employeeDao = new EmployeeDAO();

        employeeDao.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee){

        EmployeeDAO employeeDao = new EmployeeDAO();

        employeeDao.deleteEmployee(employee);

    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){

        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);

        System.out.println(formatter.getFormattedEmployee());

    }

    public static void main(String[] args) {

        Employee employee = new Employee(1, "employee", "accounting", true);
        ClientModule.hireNewEmployee(employee);

        printEmployeeReport(employee, FormatType.XML);

    }
}
