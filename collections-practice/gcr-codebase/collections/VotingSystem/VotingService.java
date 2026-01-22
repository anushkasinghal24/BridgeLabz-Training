package VotingSystem;


public class VotingService {

    private VotingManager manager = new VotingManager();

    public void vote(String candidate) {
        manager.addVote(candidate);
    }

    public void showResults() {
        manager.displayOriginalVotes();
        manager.displayVoteOrder();
        manager.displaySortedResult();
    }
}
