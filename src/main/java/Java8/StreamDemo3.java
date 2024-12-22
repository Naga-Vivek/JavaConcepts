package Java8;

import java.util.*;
import java.util.stream.*;
public class StreamDemo3{
    public static void main(String args[]){
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp("Rajesh",25,33000,"Tester"));
        list.add(new Emp("Rakesh",33,55000,"Programmer"));
        list.add(new Emp("Mukesh",44,90000,"Manager"));
        list.add(new Emp("Suresh",28,22000,"Tester"));
        list.add(new Emp("Ganesh",36,60000,"Programmer"));
        list.add(new Emp("Dinesh",22,40000,"Tester"));
        list.add(new Emp("Mahesh",52,120000,"Manager"));
        list.add(new Emp("Brijesh",27,25000,"Tester"));
        list.add(new Emp("Rupesh",31,53000,"Programmer"));
        list.add(new Emp("Puneet",29,50000,"Admin"));
        list.add(new Emp("Aniket",31,60000,"Admin"));

        Map<Boolean , List<Emp>> m1 = list.stream().collect(Collectors.partitioningBy(e->e.age>30));
        System.out.println(m1);
        System.out.println("---------------");
        Map<String , List<Emp>> m2 = list.stream().collect(Collectors.groupingBy(e->e.desig));
        System.out.println(m2);
    }
}
class Emp{
    String name;
    int age;
    int salary;
    String desig;
    public Emp(String n , int a , int s , String d){
        name = n;
        age = a;
        salary = s;
        desig = d;
    }
    public String toString(){
        return "\n"+"Emp(name: "+name+",age: "+age+" , salary: "+salary+" , desig: "+desig+")"+"\n";
    }
   
}