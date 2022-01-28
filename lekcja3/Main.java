package lekcja3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            addNewEmployee(employeeList);
        }

        while(true){
            displayMenu();
            int decision  = EmployeeUtils.getIntInput();
            switch(decision){
                case 1:
                    displaySalarySum(employeeList);
                    break;
                case 2:
                    displayAll(employeeList);
                    break;
                case 3:
                    addNewEmployee(employeeList);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Number out of range, try again");
            }
        }


    }

    private static void displaySalarySum(List<Employee> employees){
        int sum = 0;
        for(Employee employee: employees){
            sum += employee.getSalary();
        }
        System.out.println("Sum of salaries in given employee list is: " + sum);
    }

    private static void displayAll(List<Employee> employees){
        for (Employee employee: employees) {
            System.out.println(employee.getAllData());
        }
    }

    private static void displayMenu(){
        System.out.println( "1 – Print sum of all employees salary\n" +
                        "2 – Display all employees data\n" +
                        "3 – Add new employee\n" +
                        "4 – End program");
    }

    private static void addNewEmployee(List<Employee> employees){
        String name, lastName;
        int salary;
        name = EmployeeUtils.getStringFromUser("first name");
        lastName = EmployeeUtils.getStringFromUser("last name");
        System.out.println("Set salary for an employee: ");
        salary = EmployeeUtils.getIntInput();
        employees.add(new Employee(name, lastName, salary));
    }
}
