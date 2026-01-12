package studentcourseregistration;

////Custom exception when course limit exceeds
class CourseLimitExceedException extends Exception {
public CourseLimitExceedException(String message) {
  super(message);
}

}