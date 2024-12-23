package Java8;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsAssignment {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployeeList();
        Optional<Employee> secondEldest =
                employees.stream()
                .sorted((e1,e2)->e2.getAge()-e1.getAge())
                .skip(1)
                .findFirst();
        System.out.println("Second Eldest Employee:\n"+secondEldest.get());

        List<Employee> topThreeSalaried =
                employees.stream()
                .sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(3)
                .toList();
        System.out.println("\nHighest three salaried Employees:");
        topThreeSalaried.forEach(System.out::println);

        Map<Boolean, List<Employee>> genderMap = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getGender().equals("Male")));
        System.out.println("\nMale Employees: "+genderMap.get(true).size());
        System.out.println("Female Employees: "+genderMap.get(false).size());

        Map<String,List<Employee>> deptMap= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("\nDepartment wise total expense");
        for(String dept : deptMap.keySet()){
            double totalSalary = deptMap.get(dept).stream()
                                  .mapToDouble(Employee::getSalary)
                                  .sum();
                                    //.map(Employee::getSalary)
                                    //.reduce(0.0,Double::sum);

            System.out.println(dept+": "+totalSalary);
        }
    }
}
/*
Employee
--------
name, age, salary, designation, gender, department

* Find the second eldest employee in the company
* Find first 3 highest salary paid employees
* Find the number of male & females in company
* Total expense for the company department wise
 */
@Setter
@Getter
@ToString
class Employee{
    private String name;
    private int age;
    private double salary;
    private String designation;
    private String gender;
    private String department;

    // Constructor
    public Employee(String name, int age, double salary, String designation, String gender, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.gender = gender;
        this.department = department;
    }
    public static List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 70000, "Software Engineer", "Female", "IT"));
        employees.add(new Employee("Bob", 25, 50000, "Junior Developer", "Male", "IT"));
        employees.add(new Employee("Charlie", 35, 90000, "Team Lead", "Male", "IT"));
        employees.add(new Employee("Diana", 28, 60000, "UX Designer", "Female", "Design"));
        employees.add(new Employee("Edward", 40, 120000, "Manager", "Male", "Admin"));
        employees.add(new Employee("Fiona", 29, 65000, "HR Executive", "Female", "HR"));
        employees.add(new Employee("George", 32, 75000, "Database Admin", "Male", "IT"));
        employees.add(new Employee("Hannah", 26, 55000, "Quality Analyst", "Female", "QA"));
        employees.add(new Employee("Ian", 38, 110000, "Project Manager", "Male", "Admin"));
        employees.add(new Employee("Jack", 31, 70000, "Business Analyst", "Male", "Business"));
        employees.add(new Employee("Karen", 27, 58000, "Marketing Executive", "Female", "Marketing"));
        employees.add(new Employee("Liam", 45, 150000, "Director", "Male", "Management"));
        employees.add(new Employee("Mia", 33, 85000, "Tech Lead", "Female", "IT"));
        employees.add(new Employee("Noah", 22, 40000, "Intern", "Male", "IT"));
        employees.add(new Employee("Olivia", 36, 98000, "Data Scientist", "Female", "IT"));
        return  employees;
    }

}
