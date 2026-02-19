package job_portal_resume_shortlisting_system;
import java.util.*;
public class ResumeComparator implements Comparator<Resume>{
	public int compare(Resume r1 , Resume r2) {
		return Integer.compare(r2.getmatchCount(), r1.getmatchCount());
	}
	
	

}
