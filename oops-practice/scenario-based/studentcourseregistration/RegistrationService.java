package studentcourseregistration;

//Abstration for registration service
interface RegistrationService {
void enrollCourse(Student student, String course) throws CourseLimitExceedException;
void dropCourse(Student student, String course);
void assignGrades(Student student, String courseCode, String grade);
}