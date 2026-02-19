package job_portal_resume_shortlisting_system;
import java.util.*;
public class Resume {
	
	private String name;
	private Set<String>skills ;
	private int matchCount;
	
	public Resume(String name, Set<String> skills)throws InvalidException{
		if(name == null ||name.trim().isEmpty()) {
			throw new InvalidException("Resume must have a valid name ");
			
		}if(skills == null || skills.isEmpty()) {
			throw new InvalidException("Resume must have at least on skill");
		}
		
		this.name = name;
		this.skills = skills;
		
	}
	
	public String getName() {
		return name;
	}
	public Set<String> getSkills() {
		return skills;
	}
	
	public int getmatchCount() {
		return matchCount;
	}
	
	public void calculateMatch(Set<String> requiredSkills) {
		int count = 0;
		for(String skill : skills ) {
			if(requiredSkills.contains(skill)) {
				count++;
			}
		}
		this.matchCount =count;
	}
	@Override
    public String toString() {
        return "Name: " + name + 
               ", Skills: " + skills + 
               ", Matched Skills: " + matchCount;
    }
	

}
