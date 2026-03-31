package studentcourseregistration;

public  class Main implements RegistrationService {

    private static final int MAX_COURSES = 3;

    public void enrollCourse(Student student, Course course) throws CourseLimitExceedException {
        if (student.getEnrolledCourseCount() >= MAX_COURSES) {
            throw new CourseLimitExceedException(
                "Cannot enroll in more than " + MAX_COURSES + " courses."
            );
        }
        student.enrollCourse(course);
        System.out.println("Enrolled in course: " + course.getCourseName());
    }

    @Override
    public void dropCourse(Student student, String courseCode) {
        student.removeCourse(courseCode);
        System.out.println("Dropped course: " + courseCode);
    }

    @Override
    public void assignGrades(Student student, String courseCode, String grade) {
        student.addGrade(courseCode, grade);
    }

    public static void main(String[] args) {

        Main service = new Main();
        Student student = new Student(101, "Anushka", 21);

        Course c1 = new Course("CS101", "Java Programming", 9);
        Course c2 = new Course("CS102", "Data Structures", 10);
        Course c3 = new Course("CS103", "Operating Systems", 15);
        Course c4 = new Course("CS104", "Database Systems", 20);

        try {
            service.enrollCourse(student, c1);
            service.enrollCourse(student, c2);
            service.enrollCourse(student, c3);
            service.enrollCourse(student, c4); // Exception
        } catch (CourseLimitExceedException e) {
            System.out.println(e.getMessage());
        }

        service.assignGrades(student, "CS101", "A");
        service.assignGrades(student, "CS102", "B+");

        student.viewGrades();
    }

	@Override
	public void enrollCourse(Student student, String course) throws CourseLimitExceedException {
		// TODO Auto-generated method stub
		
	}
}
