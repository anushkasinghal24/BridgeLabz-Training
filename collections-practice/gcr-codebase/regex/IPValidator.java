/* Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots. */

import java.util.*;

public class IPValidator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter IP address: ");
        String ip = sc.nextLine();

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        
        if(ip.matches(regex)){
            System.out.println("Valid ip address");
        }
        else{
            System.err.println("Invalid ip address");
        }
    }
}