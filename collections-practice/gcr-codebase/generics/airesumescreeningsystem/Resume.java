package airesumescreeningsystem;

public class Resume<T extends JobRole> {

    private T candidate;

    public Resume(T candidate){
        this.candidate=candidate;
    }

    public T getCandidate(){
        return candidate;
    }

    public void resumeProcess(){
        System.out.println("Processing resume for "+candidate.getCandidateName( ));
        candidate.displayRole();
        System.out.println("Resume processed successfully");
       
    }

   
    }


   