package studentcourseregistration;

class Course {
	  private String courseName;
	  private String courseCode;
	 

	  //Constructor
	  public Course(String courseName, String courseCode, int maxStudents) {
	      this.courseName = courseName;
	      this.courseCode = courseCode;

	  }

	  //Getter methods
	  public String getCourseName() {
	      return courseName;
	  }

	  public String getCourseCode() {
	      return courseCode;
	  }


	  
	}
