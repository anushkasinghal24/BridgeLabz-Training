package university;

import java.util.ArrayList;
import java.util.List;

//Department that offers a specific evaluation type
public class Department<T extends CourseType> {

 private final String name;
 private final List<Course<T>> courses = new ArrayList<>();

 public Department(String name) {
     this.name = name;
 }

 public void addCourse(Course<T> course) {
     courses.add(course);
 }

 public List<Course<T>> getCourses() {
     return courses;
 }

 public String getName() {
     return name;
 }

 public void printCourses() {
     System.out.println("Department: " + name);
     for (Course<T> c : courses) {
         System.out.println("  " + c);
     }
 }
}
