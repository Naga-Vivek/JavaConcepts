package JavaBasics.TypesOfInterfaces;

class Employee implements Cloneable {//marker interface
    int id;
    String name;
    Department department;

    Employee(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();
        //Deep Copy
        emp.department = (Department) department.clone();
        return emp;
    }
}
class Department implements Cloneable{
    int deptId;
    String deptName;
    String deptHead;

    Department(int deptId, String deptName , String deptHead) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class MarkerInterfaceDemo2 {  
    public static void main(String[] args) {
        System.out.println("Example of Cloneable Interface - Deep Copy");
        Department dept = new Department(101, "IT", "John");
        Employee emp = new Employee(1, "Alex", dept);
        System.out.println("Before Cloning: " + emp.id + " " + emp.name + " "+emp.department.deptId + " " +emp.department.deptName + " " + emp.department.deptHead);
        System.out.println("Emp Object: "+emp+" Dept Object: "+emp.department);
        try {
            Employee emp1 = (Employee) emp.clone();
            // In the above line , clone() is called on Emp object, Emp class should override clone() method of Object otherwise it is not visible.
            System.out.println("After Cloning: " + emp1.id + " " + emp1.name + " "+emp1.department.deptId + " " +emp1.department.deptName + " " + emp1.department.deptHead);
            System.out.println("Emp1 Object: "+emp1+" Dept1 Object: "+emp1.department);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}