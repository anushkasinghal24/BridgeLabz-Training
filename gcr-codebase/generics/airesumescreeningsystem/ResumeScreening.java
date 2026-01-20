package airesumescreeningsystem;

import java.util.*;

public class ResumeScreening{
    public static void screenResume(List<? extends JobRole> resumes){
        System.out.println("Screening resumes");
        for(JobRole role:resumes){
            System.out.println("Candidate " + role.getCandidateName());

        }

        System.out.println("Resumes screened successfully");
    
    }
}