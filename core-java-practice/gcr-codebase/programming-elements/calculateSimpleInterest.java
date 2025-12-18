import java.util.*;

public class calculateSimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Simple Interest = (Principal * Rate * Time) / 100

        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();

        float simpleInterest = (principal * rate * time)/100;

        System.out.println(simpleInterest);

    
    }
}
