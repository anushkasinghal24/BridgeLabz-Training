package university;

//Generic Course bound to a CourseType

public class Course<T extends CourseType> {

 private final String courseCode;
 private final String title;
 private final T courseType; // evaluation strategy

 public Course(String courseCode, String title, T courseType) {
     this.courseCode = courseCode;
     this.title = title;
     this.courseType = courseType;
 }

 public String getCourseCode() {
     return courseCode;
 }

 public String getTitle() {
     return title;
 }

 public T getCourseType() {
     return courseType;
 }

 public double evaluateStudent(double examMarks,
         double assignmentMarks,
         double researchMarks) {
     return courseType.calculateFinalScore(examMarks,
             assignmentMarks,
             researchMarks);
 }

 @Override
 public String toString() {
     return courseCode + " - " + title
             + " [" + courseType.getEvaluationName() + "]";
 }
}