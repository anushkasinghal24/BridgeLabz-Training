package VotingSystem;

import java.util.*;

public class VotingManager {

    // HashMap → stores votes (no order)
    private HashMap<String, Integer> votes = new HashMap<>();

    // LinkedHashMap → maintains insertion order of candidates
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    public void addVote(String candidate) {
        int count = votes.getOrDefault(candidate, 0) + 1;
        votes.put(candidate, count);
        voteOrder.put(candidate, count);
    }

    public void displayOriginalVotes() {
        System.out.println("HashMap (Unordered votes): " + votes);
    }

    public void displayVoteOrder() {
        System.out.println("LinkedHashMap (Insertion order): " + voteOrder);
    }

    public void displaySortedResult() {
        TreeMap<String, Integer> sorted = new TreeMap<>(votes);
        System.out.println("TreeMap (Sorted by candidate name): " + sorted);
    }
}


   
        
    