package geekbrains_course.jdk.lesson4.seminar4;

import java.util.List;

public class Main {    
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(1, "+123456789", "John Doe", 5));
        directory.addEmployee(new Employee(2, "+987654321", "Jane Doe", 3));
        directory.addEmployee(new Employee(3, "+555555555", "Jim Beam", 5));

        System.out.println("Employees with 5 years of experience:");
        List<Employee> experiencedEmployees = directory.findEmployeesByExperience(5);
        for (Employee employee : experiencedEmployees) {
            System.out.println(employee);
        }

        System.out.println("\nPhone numbers for 'John Doe':");
        List<String> phoneNumbers = directory.getPhoneNumbersByName("John Doe");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        System.out.println("\nEmployee with ID 2:");
        Employee employeeById = directory.findEmployeeById(2);
        if (employeeById != null) {
            System.out.println(employeeById);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nAll employees:");
        directory.printAllEmployees();
    }
}
