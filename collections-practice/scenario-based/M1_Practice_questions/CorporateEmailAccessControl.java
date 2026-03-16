import java.util.Scanner;

public class CorporateEmailAccessControl {

    public static boolean isValidEmail(String email){

        String regex="^[a-z]{3,}.\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$";
        return email.matches(regex);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String email=sc.nextLine();

            if(isValidEmail(email)){
                System.out.println("Access Granted");
            }
            else{
                System.out.println("Access Denied");
            }
        }
    }
}