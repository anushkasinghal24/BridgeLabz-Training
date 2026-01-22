package VotingSystem;


public class Main {
    public static void main(String[] args) {

        VotingService service = new VotingService();
        User user = new User(service);

        System.out.println("----- Welcome to Voting System -----");

        user.takeVotes();

        System.out.println("\n----- Final Results -----");
        service.showResults();
    }
}
