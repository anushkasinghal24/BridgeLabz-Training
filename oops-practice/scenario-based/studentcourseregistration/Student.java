package studentcourseregistration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Student extends Person {

	  private int studentId;
	  private List<Course> courses;
	  private HashMap<String , String> grades;

	  //Constructor 
	  public Student (int studentId, String name, int age){
	      super(name , age) ; //Calling person constructor
	      this.studentId = studentId;
	      courses = new ArrayList<>();
	      grades = new HashMap<>();

	  }

	  //getter for student Id 
	  public int getStudentId(){
	      return studentId;
	  }

	  public void enrollCourse(Course course) {
	      courses.add(course);
	  }

	  public void addCourse(Course course) {
	      courses.add(course);
	  }

	  public void addGrade(String courseCode, String grade) {
	      grades.put(courseCode, grade);
	  }
	  


	  // Drop a course
	  public void removeCourse(String course) {
	      courses.remove(course);
	      grades.remove(course);
	  }

	  //Assign grade 
	  public void viewGrades(){
	      System.out.println("Grades for " + name + ":");
	      for(String course : grades.keySet()){
	          System.out.println(course + ":" + grades.get(course));
	      }
	  }

	  // get number of enrolled courses
	  public int getEnrolledCourseCount(){
	      return courses.size();
	  }

	  
	}
