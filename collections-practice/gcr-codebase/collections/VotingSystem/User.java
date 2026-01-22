package VotingSystem;

import java.util.*;


public class User {

    private VotingService service;

    public User(VotingService service) {
        this.service = service;
    }

    public void takeVotes() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter candidate name or type exit to quit: ");
            String candidate = sc.nextLine();

            if (candidate.equalsIgnoreCase("exit")) {
                break;
            }
            service.vote(candidate);
        }
    }
}
