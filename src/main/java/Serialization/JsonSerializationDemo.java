
package Serialization;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.ToString;

// Serialization into JSON using Jackson library.
// We can add external jars for jackson to classpath.
// or we can add dependencies using build tools like Maven.

@Getter
@ToString
class Student{
    private int rollNo;
    private String name;
    private Course course;


    public Student(int rollNo, String name, Course course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
}
@Getter
@ToString
class Course{
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

}
public class JsonSerializationDemo {
    public static void main(String[] args) {
        Course c1 = new Course(1, "Java");
        Student s = new Student(101, "Alex", c1);
        Student s2 = new Student(102, "John", c1);
        List<Student> studentList = List.of(s,s2);
        System.out.println("Before Serialization: "+s.toString()+"\n"+s2.toString());
        ObjectMapper mapper = new ObjectMapper();
        String filePath = System.getProperty("user.dir")+"\\student.json";
        System.out.println(filePath);
        File f1 = new File(filePath);
        try {
            mapper.writeValue(f1, studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
