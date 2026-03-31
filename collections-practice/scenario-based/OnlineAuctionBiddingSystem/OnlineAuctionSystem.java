package OnlineAuctionBiddingSystem;


import java.util.Scanner;
public class OnlineAuctionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Auction Item Name:");
        String itemName = sc.nextLine();
        AuctionItem item = new AuctionItem(itemName);
        System.out.println("How many users want to bid?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            try {
                sc.nextLine(); 

                System.out.println("\nEnter User ID:");
                int userId = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter User Name:");
                String name = sc.nextLine();

                System.out.println("Enter Bid Amount:");
                double amount = sc.nextDouble();

                User user = new User(userId, name);
                Bid bid = new Bid(user, amount);

                item.placeBid(bid);
                item.showHighestBid();

            } catch (InvalidBidException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        sc.close();
    }
}
