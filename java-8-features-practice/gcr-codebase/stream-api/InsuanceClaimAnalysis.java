
/*Insurance Claim Analysis
○ Scenario: Find the average claim amount for each claim type.
○ Task: Use groupingBy() and averagingDouble(). */
import java.util.*;
import java.util.stream.*;
class InsuranceClaim{
    String claimType;
    double claimAmount;

    InsuranceClaim(String claimType, double claimAmount){
        this.claimType = claimType ;
        this.claimAmount = claimAmount;
    }
    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}
public class InsuanceClaimAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<InsuranceClaim> claims = new ArrayList<>();
        System.out.println("Enter no. of Claims : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n ; i++){
            System.out.println("\nEnter Details of Claim : " + (i + 1));
            System.out.println("Claim Type : ");
            String type = sc.nextLine();
            System.out.println("CLaim Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            claims.add(new InsuranceClaim(type , amount));

        }


        //Grouping and Averaging 

        Map<String, Double> averageClaimAmount =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                InsuranceClaim::getClaimType,
                                Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                        ));
        System.out.println("\nAverage Claim Amount by Claim Type");
        averageClaimAmount.forEach((type, avg) ->
                System.out.println(type + " : " + avg)
        );
    }
    
}
