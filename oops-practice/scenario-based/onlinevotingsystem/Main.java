package onlinevotingsystem;

import java.util.*;

public class Main implements ElectionService {

    private Map<Integer, Voter> voters = new HashMap<>() ;
    private Map<Integer, Candidate> candidates = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    @Override
    public void registerVoter(Voter voter){
        voters.put(voter.getVoterId(), voter);
        System.out.println(" Voter Registered Successfully");
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidates.put(candidate.getCandidateId(), candidate);
        System.out.println("Candidate Added Successfully ");
    }

    @Override
    public void castVote(int voterId, int candidateId) throws DuplicateVoteException {

        Voter voter = voters.get(voterId);
        Candidate candidate = candidates.get(candidateId);

        if (voter == null ||  candidate == null) {
            System.out.println("Invalid Voter ID or Candidate ID");
            return;
        }

        if (voter.hasVoted()){
            throw new DuplicateVoteException(" You have already voted!");
        }

        candidate.addVote();
        voter.setHasVoted(true);
        System.out.println("Vote Cast Successfully");
    }

    @Override
    public void displayResults(){
        System.out.println("\nElection Results");
        for (Candidate c : candidates.values()) {
            System.out.println(c.getName() + " : " + c.getVotes() + " votes");
        }
    }

    public static void main(String[] args){

        Main election = new Main();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n====== Online Voting System ======");
            System.out.println("1. Register Voter");
            System.out.println("2. Add Candidate");
            System.out.println("3. Cast Vote");
            System.out.println("4. Display Results");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Voter ID: ");
                    int voterId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Voter Name : ");
                    String voterName = sc.nextLine();

                    election.registerVoter(new Voter(voterId, voterName));
                    break;

                case 2:
                    System.out.print("Enter Candidate ID : ");
                    int candidateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Candidate Name : ");
                    String candidateName = sc.nextLine();

                    election.addCandidate(new Candidate(candidateId, candidateName));
                    break;

                case 3:
                    try {
                        System.out.print("Enter Voter ID: ");
                        int vId = sc.nextInt();
                        System.out.print("Enter Candidate ID: ");
                        int cId = sc.nextInt();

                        election.castVote(vId, cId);
                    } catch (DuplicateVoteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    election.displayResults();
                    break;

                case 5:
                    System.out.println("Exiting Voting System") ;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

       
    }
}
