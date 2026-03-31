package OnlineAuctionBiddingSystem;



import java.util.TreeMap;

public class AuctionItem {

    private String itemName;
    private TreeMap<User, Double> bids;
    private double highestBid;
    private User highestBidder;

    public AuctionItem(String itemName) {
        this.itemName = itemName;
        this.bids = new TreeMap<>();
        this.highestBid = 0.0;
    }

    public void placeBid(Bid bid) throws InvalidBidException {

        if (bid.getAmount() <= highestBid) {
            throw new InvalidBidException(
                    "Bid must be higher than current highest bid (" + highestBid + ")");
        }

        bids.put(bid.getUser(), bid.getAmount());
        highestBid = bid.getAmount();
        highestBidder = bid.getUser();

        System.out.println("Bid placed successfully!!!");
    }

    public void showHighestBid() {
        if (highestBidder == null) {
            System.out.println("No bids yet.");
        } else {
            System.out.println("Highest Bid: " + highestBid +
                    " by " + highestBidder.getName());
        }
    }
}
